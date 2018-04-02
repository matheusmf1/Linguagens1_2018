package testeentrada;

import java.util.Scanner;

public class TesteEntrada {

  
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite sua idade");
        
        int a = entrada.nextInt();
        
        System.out.println("Idade informada: " + a);
        
    }
    
}
//estando dentro de um metodo static não usar this, pois refere-se um objeto. Dará pau pq não tem um objeto, chama-se pela classe.
//metodo pertence a uma classe não a um objeto
