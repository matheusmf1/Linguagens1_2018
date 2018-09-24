/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Matheus
 */
public class JavaSQlite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ItemDAO itemDAO = new ItemDAO();
        if(itemDAO.CreateTable()) System.out.println("Tabela Criada!");
        else System.out.println("Deu erro!");
        
        ArrayList<Item> items = itemDAO.GetAll();
        //INSERCAO DE DADOS
        System.out.println("-----Primeira inserção-----");
        Item item1 = new Item(1,3,"Max Elixir", 300);
        Item item2 = new Item(2,4,"Pokebola", 150);
        Item item3 = new Item(3,10,"Ultrabola", 600);
        
        //itemDAO.InsertItem(item1);
        //itemDAO.InsertItem(item2);
        //itemDAO.InsertItem(item3);
        
        items = itemDAO.GetAll();
        System.out.println(items);
        
        //UPDATE DAS INFORMACOES
        //Item item = new Item(1,0,"TESTE", 0);
        //itemDAO.UpdateData(item); 
        items = itemDAO.GetAll();
        System.out.println("-----Depois da modificacao-----");
        System.out.println(items);
        
        
        System.out.println("-----TENTATIVA DE DELETE-----");
        itemDAO.DeleteItem(item1);
        itemDAO.DeleteItem(item2);
        itemDAO.DeleteItem(item3);
        items = itemDAO.GetAll();
        System.out.println(items);
        
        
      
        
    }
    
}
