/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olacollections;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Matheus
 */
public class OlaCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Teste1");
        nomes.add("Teste2");
        nomes.add("Goku");
        nomes.add("Vegeta");
        System.out.println("Sem ordem");
        System.out.println(nomes);
        
        
        Collections.sort(nomes);
        System.out.println("Em ordem: ");
        System.out.println(nomes);
             
        
    }
    
}
