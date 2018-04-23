package concessionaria2;


public class Gerente extends Vendedor{
    private static int numeroDeFuncionariosGerenciados;
    private double comissao;
    
    
    
    public Gerente(String nome, double salarioBase){
        super(nome,salarioBase);
        Gerente.numeroDeFuncionariosGerenciados++;
}

    

    
}
