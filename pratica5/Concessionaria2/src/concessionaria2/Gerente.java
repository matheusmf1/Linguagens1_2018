package concessionaria2;


public class Gerente extends Vendedor{
    
    private static int numeroDeFuncionariosGerenciados;
    private String senha;
    

    public Gerente(String nome, double salarioBase, String senha){  
        super(nome,salarioBase);
        this.senha = senha;
        Gerente.numeroDeFuncionariosGerenciados++;
    }
   
    
    public boolean autentica(String senha) {
        if (this.senha == senha) {
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
        System.out.println("Novo salario eh: " + v.getSalarioBase());
    }

     
}
