/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordemdados;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Matheus
 */
public class OrdemDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Dados> dados = new ArrayList<Dados> ();
        dados.add(new Dados(2,"Bunda"));
        dados.add(new Dados(5,"Asa Akira"));
        dados.add(new Dados(1,"Alt Shita"));
        
        System.out.println("Sem ordem:");
        System.out.println(dados);
        
        Collections.sort(dados);
        System.out.println("Em ordem: ");
        System.out.println(dados);
        
    }
    
}
