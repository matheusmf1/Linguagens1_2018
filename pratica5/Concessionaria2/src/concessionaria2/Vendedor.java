package concessionaria2;


public class Vendedor extends Funcionario {
    
    private double comissao;
    private double valorVenda;
    private Gerente gerenteResponsavel;
    private double salarioMes;

    
    public Vendedor (String nome, double salarioBase){
        super(nome,salarioBase);

    }
    
    public void realizarVenda(double valor){
        this.valorVenda += valor;
        Funcionario.totalDeVendas+= valor;
    }
    
    public double getComissao(){
//        System.out.println("Vendedor ValorVenda: " + Vendedor.valorVenda);
//        System.out.println("Funcionario bonus extra: " + Funcionario.getBonusExtra());
        return this.comissao = (this.valorVenda * 0.02 + Funcionario.getBonusExtra());
       
    }
    
      public double getSalarioMes() {
           
        return this.salarioMes = Funcionario.getBonusExtra() + getSalarioBase() + this.getComissao();

    }
   
    public String getGerenteResponsavel() {
        return gerenteResponsavel.getNome();
    }
    
    public void setGerenteResponsavel (Gerente g){
        this.gerenteResponsavel = g;          
    }

    
    

    
    
}