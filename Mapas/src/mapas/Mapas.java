/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapas;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Matheus
 */
public class Mapas {

    //Maps é equivalente a estrutura de dicionario no Python, onde é 
    //verificado uma relacao object chave: object valor
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Map<String, Dados> map = new HashMap<String, Dados>();
        
        map.put("aqui",new Dados(1,"Aqui"));
        map.put("chave 2", new Dados(10, "Oi"));
        map.put("aqui", new Dados(5, "Goku"));
        
        if(map.containsKey("aqui")) 
            System.out.println("Ja tem");
        
        
//        System.out.println("Map: ");
//        System.out.println(map);        

        for(String chave: map.keySet()){
            Dados d = map.get(chave);
            System.out.println("Chave: " + chave);
            System.out.println("Valor: " + d + "\n");
        }
    }
    
}
