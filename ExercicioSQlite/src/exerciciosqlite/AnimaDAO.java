/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Matheus
 */
public class AnimaDAO {
    private final String TABELA = "animal";
    
    public boolean CreateTable(){
        //Responsável por fazer a conexão com o banco
        Connection c = null;
        //Responsável por aplicar as queries
        Statement stmt = null;    
        try{
            //Estabelece a conexão com o banco usando o driver
            c = DriverManager.getConnection("jdbc:sqlite:banco.db");
            
            stmt = c.createStatement();
           
            String sql = "CREATE TABLE IF NOT EXISTS "+ TABELA +"(" +
                    "id INT PRIMARY_KEY NOT NULL,"
                    + "name VARCHAR(45),"
                    + "latitude REAL,"
                    + "longitude REAL,"
                    + "altura REAL,"
                    + "peso REAL,"
                    + "tipo VARCHAR(45));";
            
            stmt.executeUpdate(sql);            
            stmt.close();
            c.close();
        }
        catch(Exception e){
            System.out.println("Exception:"+e.getMessage());
            return false;
        }
        return true;
    }
    
    public boolean InsertItem(Animal animal){
        Connection c = null;
  
        try{
            c = DriverManager.getConnection("jdbc:sqlite:banco.db");
           
            c.setAutoCommit(false);
            
            String sql = "INSERT INTO " + TABELA + " VALUES(?,?,?,?,?,?,?);";
           
            PreparedStatement ps = c.prepareStatement(sql);
            
            ps.setInt(1, animal.getId());
            ps.setString(2, animal.getName());
            ps.setDouble(3, animal.getLatitude());
            ps.setDouble(4, animal.getLongitude());
            ps.setDouble(5, animal.getAltura());
            ps.setDouble(6, animal.getPeso());
            ps.setString(7, animal.getTipo());
            
            ps.executeUpdate();
            
            c.commit();
            c.close();
        }
        catch(Exception e){
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            return false;
        }
        return true;
    }
    
    public ArrayList<Animal> GetAll(){
        ArrayList<Animal> animals = new ArrayList<>();
        //Responsável por fazer a conexão com o banco
        Connection c = null;
        //Responsável por aplicar as queries
        Statement stmt = null;    
        try{
            //Estabelece a conexão com o banco usando o driver
            c = DriverManager.getConnection("jdbc:sqlite:banco.db");
            
            stmt = c.createStatement();
            
            String sql = "SELECT * FROM "+ TABELA +";";
            //Tabela de resposta com os dados do banco - retorno da query
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double latitude = rs.getDouble("latitude");
                double longitude = rs.getDouble("longitude");
                double altura = rs.getDouble("altura");
                double peso = rs.getDouble("peso");
                String tipo = rs.getString("tipo");
               
                animals.add(new Animal(id, name, latitude, longitude, altura, peso, tipo));
            }
            
            rs.close();
            stmt.close();
            c.close();
        }
        catch(Exception e){
            System.out.println("Exception:"+e.getMessage());           
        }
        return animals;
    }
   
}
