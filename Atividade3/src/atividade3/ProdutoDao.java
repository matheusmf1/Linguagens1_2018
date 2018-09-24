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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 15.00175-0
 */
public class ProdutoDao {
    private static final String URL = "jdbc:mysql://localhost:3306/lojamaterialconstrucao";
    private static final String USER = "root";
    private static final String PASS = "";
    private static final String TABLE = "produtos";
    
    protected List<Produto> getAllByCategory(String categ) {
        Connection conn = null;
        Statement stmt = null;
        List<Produto> products = new ArrayList<>();
        
        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM " + TABLE + " WHERE categoria='" + categ + "'");
            
            while (rs.next()) {
                Produto product = this.extractProductFromResultSet(rs);
                products.add(product);
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
        
        return products;
    }
    
    protected List<Produto> getAll() {
        Connection conn = null;
        Statement stmt = null;
        List<Produto> products = new ArrayList<>();
        
        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM " + TABLE);
            
            while (rs.next()) {
                Produto product = this.extractProductFromResultSet(rs);
                products.add(product);
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
        
        return products;
    }
    
    protected boolean insert(Produto product) {
        Connection conn = null;
        boolean result = false;
        
        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement ps = conn.prepareStatement("INSERT INTO " + TABLE + " VALUES (NULL, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, product.getCode());
            ps.setString(2, product.getName());
            ps.setDouble(3, product.getPrice());
            ps.setInt(4, product.getQuant());
            ps.setString(5, product.getFab());
            ps.setString(6, product.getCateg());
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
    
    protected Produto search(String categ, String code) {
        Connection conn = null;
        Statement stmt = null;
        Produto result = null;

        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            stmt = conn.createStatement();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM " + TABLE + " WHERE categoria=? AND codigo=?");
            ps.setString(1, categ);
            ps.setString(2, code);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                result = this.extractProductFromResultSet(rs);
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
        
        return result;
    }

    protected boolean update(Produto product) {
        Connection conn = null;
        boolean result = false;
        
        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement ps = conn.prepareStatement("UPDATE " + TABLE + " SET nome=?, preco=?, quantidade=?, fabricante=? WHERE categoria=? AND codigo=?");
            ps.setString(1, product.getName().replace("'", "''"));
            ps.setDouble(2, product.getPrice());
            ps.setInt(3, product.getQuant());
            ps.setString(4, product.getFab().replace("'", "''"));
            ps.setString(5, product.getCateg().replace("'", "''"));
            ps.setString(6, product.getCode().replace("'", "''"));
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
    
    private Produto extractProductFromResultSet(ResultSet rs) throws SQLException {
        return new Produto(rs.getString("codigo"), rs.getString("nome"),
                rs.getDouble("preco"), rs.getInt("quantidade"),
                rs.getString("fabricante"), rs.getString("categoria"));
    }
}
