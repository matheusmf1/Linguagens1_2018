
package concessionaria;

public class Concessionaria {

        public static void main(String[] args) {
            

            Funcionarios f1;
         
            f1 = new Funcionarios(680.89);
         
            f1.venda(100);
            f1.venda(160);
           

            Funcionarios f2;
            
            f2 = new Funcionarios(700.00);
            f2.venda(45);
            f2.venda(20);
            
            
            f1.getSalarioBase();
            f1.getVendaFun();
            f1.getSalarioMes();
            
            f2.getSalarioBase();
            f2.getVendaFun();
            f2.getSalarioMes();
           
       
    }
    
}
