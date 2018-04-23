package concessionaria2;


public class Vendedor extends Funcionario {
    
    private double comissao;
    private double valorVendas;
    
    
    public Vendedor (String nome, double salarioBase){
        super(nome,salarioBase);
    }
    
    public void realizarVenda(double valorVenda){
        this.valorVendas += valorVenda;

    }
    
    public void calcularComissao(){
        this.comissao = 0.02*this.valorVendas + Funcionario.getBonusExtra();
    
    }
        
}
