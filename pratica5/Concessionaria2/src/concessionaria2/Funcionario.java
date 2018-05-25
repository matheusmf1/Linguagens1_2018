package concessionaria2;

public class Funcionario {

    protected String nome;
    protected static double salarioBase;
    
    private String senha;
    private static double bonusExtra;
    private static double aliquotaBonus = 0.05;
    private static double salarioMes;
 
    
    public Funcionario(String nome, double salarioBase) {

        this.nome = nome;
        this.salarioBase = salarioBase;

    }

    public boolean autentica(String senha) {
        if (this.senha == senha) {
            System.out.println("Acesso permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }

    public String getNome() {
        return this.nome;
    }

    //metodos da classe
    
    public static double getSalarioBase() {
        return Funcionario.salarioBase;
    }
    
 
    protected void setSalarioBase(double salario, String senha) {
        if (autentica(senha)) {
            this.salarioBase = salario;
        }
    }
    
    public static void calcularBonusExtra(double vendasTotais, double nFuncionarios) {
        Funcionario.bonusExtra = (vendasTotais * aliquotaBonus) / nFuncionarios;
    }

    public static void calculaSalarioMes() {

        Funcionario.salarioMes = Funcionario.getSalarioBase() + Funcionario.getBonusExtra();

    }
    
    public static double getBonusExtra() {
        return Funcionario.bonusExtra;
    }

    public static double getSalarioMes() {
        return Funcionario.salarioMes;
    }

}



