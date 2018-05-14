package concessionaria2;

public class Funcionario {

    protected String nome;
    private String senha;

    protected static double salarioBase;
    private static double bonusExtra;
    private static double aliquotaBonus = 0.05;
    private static double salarioMes;

    //private double vendaFun;
    public Funcionario(String nome, double salarioBase) {

        this.nome = nome;
        this.salarioBase = salarioBase;

    }

    public static void calcularBonusExtra(double vendasTotais, double nFuncionarios) {
        Funcionario.bonusExtra = (vendasTotais * aliquotaBonus) / nFuncionarios;
    }

    public static void calculaSalarioMes() {

        Funcionario.salarioMes = Funcionario.getSalarioBase() + Funcionario.getBonusExtra();

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

    protected void setSalarioBase(double salario, String senha) {
        if (autentica(senha)) {
            this.salarioBase = salario;
        }

    }

    public String getNome() {
        return this.nome;
    }

    public static double getSalarioBase() {
        return Funcionario.salarioBase;
    }

    public static double getBonusExtra() {
        return Funcionario.bonusExtra;
    }

    public static double getSalarioMes() {
        return Funcionario.salarioMes;
    }

}
