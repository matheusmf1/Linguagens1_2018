
package concessionaria;

public class Concessionaria {

        public static void main(String[] args) {
            
  
            Gerente g1;
            
            g1 = new Gerente(1500); 
            g1.funcionario.venda(499.99);
            
            g1.getSalarioTotalGerente();
            
            
            Vendedor v1;
            
            v1 = new Vendedor(1500,g1);
            v1.funcionario.venda(199.99);
            v1.funcionario.venda(30);
            v1.funcionario.venda(150.00);
            v1.funcionario.venda(75.00);
            
        
            Vendedor v2;
           
            v2 = new Vendedor(1500,g1);
            v2.funcionario.venda(99.99);
            v2.funcionario.venda(80);
            v2.funcionario.venda(50.00);
            v2.funcionario.venda(25.00);
             

            v1.funcionario.getSalarioBase();
            v1.funcionario.getVendaFun();
            v1.funcionario.getSalarioMes();
         
            v2.funcionario.getSalarioBase();
            v2.funcionario.getVendaFun();
            v2.funcionario.getSalarioMes();
      
           
           
    }
    
}
