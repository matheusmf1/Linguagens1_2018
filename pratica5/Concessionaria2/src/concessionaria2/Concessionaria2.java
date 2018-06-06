package concessionaria2;

public class Concessionaria2 {

    public static void main(String[] args) {
        
        
        Gerente g1;
        
        Vendedor v1; 
        Vendedor v2;
       
        g1 = new Gerente("João Victor", 5000.00,"teste");
        
        v1 = new Vendedor("Matheus", 1300.00);
        v2 = new Vendedor("Rodolfo", 1400.00);
        
        
        v1.setGerenteResponsavel(g1);
        v2.setGerenteResponsavel(g1);
        
        
        // vendas
        v1.realizarVenda(149.99);
        v1.realizarVenda(250.00);
        v2.realizarVenda(120.00);
        v2.realizarVenda(400.00);
        g1.realizarVenda(300.00);
        
   
        
        System.out.printf("Comissao v1: %.2f\n",v1.getComissao());
        
        System.out.println("-----------------------");
         
        System.out.printf("Comissao v2: %.2f\n",v2.getComissao());
        
        System.out.println("-----------------------");
        
        System.out.printf("Comissao g1: %.2f\n ",g1.getComissao());
        
        System.out.println("-----------------------");
        
        
        System.out.printf("Salario do mes: v1: %.2f\n", v1.getSalarioMes());
        System.out.printf("Salario do mes: v2: %.2f\n", v2.getSalarioMes());
        System.out.printf("Salario do mes: g1: %.2f\n", g1.getSalarioMes());
        
        System.out.println("-----------------------");
        
        
        
        System.out.println("Gerente do vendedor v1 eh: " + v1.getGerenteResponsavel());
        System.out.println("Gerente do vendedor v2 eh: " + v2.getGerenteResponsavel());
     
        System.out.println("-----------------------");
        
        g1.darAumento(800, "teste", v1);
        System.out.println("-----------------------");
        g1.darAumento(500, "teste", v2);      
    }

}
