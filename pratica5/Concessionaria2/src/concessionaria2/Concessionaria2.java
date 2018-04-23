package concessionaria2;

public class Concessionaria2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario f1;
         
            f1 = new Funcionario(680.89);
         
            f1.venda(100);
            f1.venda(160);
           

            Funcionario f2;
            
            f2 = new Funcionario(700.00);
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
