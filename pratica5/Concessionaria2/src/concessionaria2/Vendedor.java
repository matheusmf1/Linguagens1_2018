package concessionaria2;


public class Vendedor extends Funcionario {
    
    private double comissao;
    private  double valorVenda;
    private Funcionario gerenteResponsavel;
    

    
    public Vendedor (String nome, double salarioBase){
        super(nome,salarioBase);

    }
    
    public void realizarVenda(double valor){
        this.valorVenda += valor;
    }
    
    public void calcularComissao(){
        this.comissao = 0.02*this.valorVenda + Funcionario.getBonusExtra();
    
    }

    public String getGerenteResponsavel() {
        String responsavel;
        responsavel =  gerenteResponsavel.getNome();
        return responsavel;
    }
    
    public void setGerenteResponsavel (Gerente g){
        this.gerenteResponsavel = g;          
    }
    
}