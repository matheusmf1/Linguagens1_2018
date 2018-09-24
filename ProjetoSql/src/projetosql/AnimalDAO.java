/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author murilo
 */
public class AnimalDAO {
    
    private static final String TABELA = "animais";
    private static final String USER = "root";
    private static final String PASS = "root";
    private static final String URL_BANCO = "jdbc:mysql://localhost:8889/meudb";
    
    
    public ArrayList<Animal> GetAll(){
        ArrayList<Animal> animais = new ArrayList<>();
        //Responsável por fazer a conexão com o banco
        Connection conexao = null;
        //Responsável por aplicar as queries
        Statement stmt = null;    
        try{
            //Estabelece a conexão com o banco usando o driver
            //conexao = DriverManager.getConnection("jdbc:sqlite:banco.db");
            conexao = DriverManager.getConnection(URL_BANCO, USER, PASS);
            
            stmt = conexao.createStatement();
            
            String sql = "SELECT * FROM "+ TABELA +";";
            //Tabela de resposta com os dados do banco - retorno da query
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Animal novo = new Animal();
                novo.setNome(rs.getString("nome"));
                novo.setPeso(rs.getDouble("peso"));
                novo.setTipo(rs.getString("tipo"));
                Localizacao novoLoc = new Localizacao(rs.getDouble("lat"), rs.getDouble("lon"));
                novo.setLocalizacao(novoLoc);
                animais.add(novo);
            }
            rs.close();
            stmt.close();
            conexao.close();
        }
        catch(Exception e){
            System.out.println("Exception:"+e.getMessage());           
        }
        return animais;
    }
    
    public ArrayList<Animal> GetAnimal(String nome){
        ArrayList<Animal> animais = new ArrayList<>();
        //Responsável por fazer a conexão com o banco
        Connection conexao = null;
        //Responsável por aplicar as queries
        Statement stmt = null;    
        try{
            //Estabelece a conexão com o banco usando o driver
            //conexao = DriverManager.getConnection("jdbc:sqlite:banco.db");
            conexao = DriverManager.getConnection(URL_BANCO, USER, PASS);
            
            stmt = conexao.createStatement();
            
            String sql = "SELECT * FROM "+ TABELA +" WHERE nome = \'" + nome + "\';";
            //Tabela de resposta com os dados do banco - retorno da query
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Animal novo = new Animal();
                novo.setNome(rs.getString("nome"));
                novo.setPeso(rs.getDouble("peso"));
                novo.setTipo(rs.getString("tipo"));
                Localizacao novoLoc = new Localizacao(rs.getDouble("lat"), rs.getDouble("lon"));
                novo.setLocalizacao(novoLoc);
                animais.add(novo);
            }
            rs.close();
            stmt.close();
            conexao.close();
        }
        catch(Exception e){
            System.out.println("Exception:"+e.getMessage());           
        }
        return animais;
    }
    
    public boolean InsertAnimal(Animal animal){
        //Responsável por fazer a conexão com o banco
        Connection conexao = null;
      
        try{
            //Estabelece a conexão com o banco usando o driver
            conexao = DriverManager.getConnection(URL_BANCO, USER, PASS);

            conexao.setAutoCommit(false);
            
            String sql = "INSERT INTO " + TABELA + " VALUES(null,?,?,?,?,?);";
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1,animal.getNome());
            ps.setDouble(2,animal.getLocalizacao().getLat());
            ps.setDouble(3,animal.getLocalizacao().getLon());
            ps.setString(4,animal.getTipo());
            ps.setDouble(5,animal.getPeso());
            ps.executeUpdate();
            
            conexao.commit();
            conexao.close();
        }
        catch(Exception e){
            System.out.println("Exception:"+e.getMessage());
            return false;
        }
        return true;
    }

    public void AtualizaDados(Animal animal){
        //Responsável por fazer a conexão com o banco
        Connection conexao = null;
      
        try{
            //Estabelece a conexão com o banco usando o driver
            conexao = DriverManager.getConnection(URL_BANCO, USER, PASS);
            
            conexao.setAutoCommit(false);
            
            String sql = "UPDATE " + TABELA + " SET "
                    + "tipo = ?, lat = ?, lon = ?, peso = ? WHERE nome = ?;";
            
            PreparedStatement ps = conexao.prepareStatement(sql);
           
            ps.setString(1, animal.getTipo());
            ps.setDouble(2, animal.getLocalizacao().getLat());
            ps.setDouble(3, animal.getLocalizacao().getLon());
            ps.setDouble(4, animal.getPeso());
            ps.setString(5, animal.getNome());
            
            ps.executeUpdate();
            
            conexao.commit();
            conexao.close();
        }
        catch(Exception e){
            System.out.println("Exception:"+e.getMessage());            
        }
    }
}
