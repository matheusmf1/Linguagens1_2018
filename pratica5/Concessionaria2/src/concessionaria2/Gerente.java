package concessionaria2;


public class Gerente extends Funcionario implements Autenticavel {
    
    private static int numeroDeFuncionariosGerenciados;
    private String senha;
    
    private double valorVenda;
    private double comissao;
    private double salarioMes;
    

    public Gerente(String nome, double salarioBase, String senha){  
        super(nome,salarioBase);
        this.senha = senha;
        Gerente.numeroDeFuncionariosGerenciados++;
    }
   
    
    @Override
    public boolean autentica(String senha) {
        if (this.senha.equals(senha)) {
            System.out.println("Acesso permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado! ");
            return false;
        }
    }
 
    
    public void darAumento(double valor, String senha, Vendedor v){
        double novoSalario;
        if(autentica(senha)){
           // v.id == this.id
            novoSalario = v.getSalarioBase() + valor;
            v.setSalarioBase(novoSalario);
        }
        System.out.printf("Novo salario eh: %.2f\n ",v.getSalarioBase());
    }

    public void realizarVenda(double valor){
        this.valorVenda += valor;
        Funcionario.totalDeVendas+= valor;
    }
    
    public double getComissao(){
        return this.comissao = (this.valorVenda * 0.1 + 0.5 * getSalarioBase() + Funcionario.getBonusExtra());
       
    }
    
    public double getSalarioMes() {
           
        return this.salarioMes = Funcionario.getBonusExtra() + getSalarioBase() + this.getComissao();
    

    }
    
   
}
