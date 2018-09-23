/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

import java.util.TreeSet;

/**
 *
 * @author Matheus
 */
public class Arvore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
//        Um TreeSet nao contem valores iguais
//        TreeSet, que insere os elementos de tal forma que, quando forem percorridos, 
//        eles apareçam em uma ordem definida pelo método de comparação entre seus elementos.
//        Esse método é definido pela interface java.lang.Comparable. 
//        Ou, ainda, pode se passar um Comparator para seu construtor.

        TreeSet<Dados> tree = new TreeSet<Dados>();
        tree.add(new Dados(1,"Matheus"));
        tree.add(new Dados(10,"Cobre"));
        tree.add(new Dados(10,"Cobre"));
        tree.add(new Dados(5,"Thanos"));
        //
        
        System.out.println("Conjunto de dados: ");
        System.out.println(tree);
    }
    
}
