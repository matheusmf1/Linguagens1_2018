/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botas;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Matheus
 */
public class MapBotas {
    
    Botas b1;
    
    
    public static void main(String[] args) {
        int n;
        
        String [] entradas = {"38 E", "39 E", "40 D", "38 D", "40 D", "37 E"};
        int N = 6;
        
        Map <String, Map> botas = new HashMap<String, Map>();
        
        for(int i = 0; i < N; i++){
            String [] dados = entradas[i].split(" ");
            //Verifica se a chave já existe
            if(botas.containsKey(dados[0])){
                Map<String, Integer> peh = botas.get(dados[0]);
                int x = peh.get(dados[1]);
                x++;
                peh.put(dados[1], x);
            }
            else{
                Map<String, Integer> par = new HashMap<String, Integer>();
                par.put("D", 0);
                par.put("E", 0);
                par.put(dados[1], 1);
                botas.put(dados[0], par);
     
        }
        }
        
        System.out.println(botas);
        
        int pares = 0;
        for(String key: botas.keySet()){
            int e = (int)botas.get(key).get("E");
            int d = (int)botas.get(key).get("D");
            
            pares += Math.min(e,d);
            
            
        }
       System.out.println(pares); 
          
}
    
}
