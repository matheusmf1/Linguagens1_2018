package aula4;


public class Aula4 {
 
    public static void main(String[] args) {
        
        Conta c1;
        c1 = new Conta("8081 23545-7", 10000, "Matheus", "Mandotti", "433.218.358-43");
        
        Conta c2;
        c2 = new Conta("8791 66445-7", 8000, "Rey", "Skywalker", "111.222.358-89");
     
        
        if(c1 == c2) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
        
        
        

        System.out.println("Saldo inicial c1 = " + c1.visualizarSaldo());
        System.out.println("Saldo inicial c2 = " + c2.visualizarSaldo());
        
        c1.sacar(9000);
        System.out.println("Valor pós saque de c1 " + c1.visualizarSaldo());
        
        
        c1.depositar(5000);
        System.out.println("Valor pós depósito c1 " + c1.visualizarSaldo());
        
        
        c1.transferirDinheiro(c2,1500);
        System.out.println("Valor pós transferencia da conta c1 = " + c1.visualizarSaldo());
        System.out.println("Valor pós transferencia da conta c2 = " + c2.visualizarSaldo());
        
        
        
       
            
    }
    
}
