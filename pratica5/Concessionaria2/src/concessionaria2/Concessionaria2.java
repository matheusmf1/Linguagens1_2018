package concessionaria2;

public class Concessionaria2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario f1;

        f1 = new Funcionario("Renata", 1000.00);

        Vendedor v1;

        v1 = new Vendedor("Matheus", 1500.00);

        v1.realizarVenda(149.99);
        v1.realizarVenda(250.00);

        Gerente g1;
        
        g1 = new Gerente("João Victor", 2000.00);
        
        
        v1.getSalarioBase();
        //v1.getVendaFun();
        //v1.getSalarioMes();
    }

}
