/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atividade3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author 15.00175-0
 */
public class UsuarioDao {
    private static final String URL = "jdbc:mysql://localhost:3306/lojamaterialconstrucao";
    private static final String USER = "root";
    private static final String PASS = "";
    private static final String TABLE = "usuarios";
    
    protected Usuario get(String name, String pass) {
        Connection conn = null;
        Statement stmt = null;
        Usuario user = null;
        
        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM " + TABLE + " WHERE nome='" + name + "' AND senha='" + pass + "'");
            
            if (rs.next()) {
                user = this.extractUserFromResultSet(rs);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
                
                //System.out.println("Connection to SQLite has been closed successfully.");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
        
        return user;
    }
    
    protected boolean insert(Usuario user) {
        Connection conn = null;
        boolean result = false;
        
        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement ps = conn.prepareStatement("INSERT INTO " + TABLE + " VALUES (NULL, ?, ?)");
            ps.setString(1, user.getName());
            ps.setString(2, user.getPass());
            int i = ps.executeUpdate();
            
            if (i == 1) {
                result = true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                
                //System.out.println("Connection to SQLite has been closed successfully.");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
        
        return result;
    }
    
    private Usuario extractUserFromResultSet(ResultSet rs) throws SQLException {
        return new Usuario(rs.getString("nome"), rs.getString("senha"));
    }
}
