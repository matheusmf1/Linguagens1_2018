package aula4;


public class Aula4 {
 
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Cliente cliente1 = new Cliente();
        cliente1.nome = "Matheus ";
        cliente1.sobrenome = "Mandotti";
        cliente1.cpf = "433.218.358-76";
        
        Cliente cliente2 = new Cliente();
        cliente2.nome = "Rey ";
        cliente2.sobrenome = "Skywalker";
        cliente2.cpf = "123.446.777-87";
        
       
        
        Conta c1 = new Conta();
   
        c1.titular = cliente1.nome + cliente1.sobrenome;
        c1.saldo = 10000;
        c1.cfp = cliente1.cpf;
   
       
        
        
        Conta c2 = new Conta();
        c2.titular = cliente2.nome + cliente2.sobrenome;
        c2.saldo = 8000;
        c2.cfp = "222.345.678-90";
       
        
        System.out.println(c1.titular);
        System.out.println(c2.titular);
        
        if(c1 == c2) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
   
        
        System.out.println("Saldo inicial c1 = " + c1.saldo);
        System.out.println("Saldo inicial c2 = " + c2.saldo);
        
        c1.sacar(9000);
        c1.visualizarSaldo();
        System.out.println("Valor pós saque " + c1.saldo);
        
        
        c1.depositar(5000);
        c1.visualizarSaldo();
        System.out.println("Valor pós depósito c1 " + c1.saldo);
        
        
        c1.transferirDinheiro(c2,1500);
        System.out.println("Valor pós transferencia da conta c1 = " + c1.saldo);
        System.out.println("Valor pós transferencia da conta c2 = " + c2.saldo);
        
        
        
       
            
    }
    
}
