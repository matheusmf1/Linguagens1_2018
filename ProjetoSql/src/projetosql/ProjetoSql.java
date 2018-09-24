/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosql;

/**
 *
 * @author murilo
 */
public class ProjetoSql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AnimalDAO pegaDados = new AnimalDAO();
//        Animal a1 = new Animal("Goku", "Fodao", 100.0, 35.6694219,139.4611883);
//        pegaDados.AtualizaDados(a1);
        System.out.println("Dados:" + pegaDados.GetAnimal("Goku"));
    }
    
}
