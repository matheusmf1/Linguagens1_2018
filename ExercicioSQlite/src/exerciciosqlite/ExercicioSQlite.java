/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosqlite;

import java.util.ArrayList;

/**
 *
 * @author Matheus
 */
public class ExercicioSQlite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AnimaDAO animaDAO = new AnimaDAO();
        if(animaDAO.CreateTable()) System.out.println("Tabela Criada!");
        else System.out.println("Deu erro!");
        
        Animal a1 = new Animal(1,"Girafa",-112.2832,+343.3293,6.98,50.98,"Herbivaro");
        animaDAO.InsertItem(a1);
        //System.out.println();
    }
    
}
