/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullerror;

/**
 *
 * @author Matheus
 */
public class NullError {

    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;
        try{
            novaFrase = frase.toUpperCase();
            System.out.println("Frase nova: "+novaFrase);
        }
        catch(NullPointerException e){
            
        System.out.println("Erro null pointer "+e);
        }
    }
    
}
