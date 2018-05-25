package concessionaria2;


public class Gerente extends Vendedor{
    
    private static int numeroDeFuncionariosGerenciados;
    private String senha;
    private  double salario2;

    public Gerente(String nome, double salarioBase,String senha){  
        super(nome,salarioBase);
        this.senha = senha;
        Gerente.numeroDeFuncionariosGerenciados++;
}

  
    
}
