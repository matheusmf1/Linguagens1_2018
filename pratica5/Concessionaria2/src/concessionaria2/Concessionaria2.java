package concessionaria2;

public class Concessionaria2 {

    public static void main(String[] args) {
        
        
        Gerente g1;
        
        Vendedor v1;
        
        Funcionario f1; 
        
        f1 = new Funcionario("Renata", 1000.00);
        
        g1 = new Gerente("João Victor", 5000.00,"teste");
        
        v1 = new Vendedor("Matheus", 3000.00);
 
        
     
        v1.setGerenteResponsavel(g1);
        v1.realizarVenda(149.99);
        v1.realizarVenda(250.00);
        g1.realizarVenda(300.00);

   
        System.out.println("Gerente do vendedor v1 eh: " + v1.getGerenteResponsavel());
     
        g1.darAumento(800, "teste", v1);
       
        
    }

}
