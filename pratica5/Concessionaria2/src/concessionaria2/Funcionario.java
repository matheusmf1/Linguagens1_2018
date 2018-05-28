package concessionaria2;

public class Funcionario {

    protected String nome;
    private double salarioBase;
    private static double bonusExtra;
    private static double aliquotaBonus = 0.05;
    private static double salarioMes;
    public static int nFuncionario;
    private static double salario;
    
 
    
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        Funcionario.nFuncionario++;

    }

    public String getNome() {
        return this.nome;
    }

    
    public double getSalarioBase() {
  
        return this.salarioBase;
    }

    public void setSalarioBase(double salario) {
           this.salarioBase = salario;
        }
    
       
    public static void calcularBonusExtra(double vendasTotais, double nFuncionarios) {
        Funcionario.bonusExtra = (vendasTotais * aliquotaBonus) / nFuncionarios;
    }

    public void calculaSalarioMes() {
           
        Funcionario.salarioMes = this.getSalarioBase() + Funcionario.getBonusExtra();

    }
    
    public static double getBonusExtra() {
        return Funcionario.bonusExtra;
    }

    public static double getSalarioMes() {
        return Funcionario.salarioMes;
    }

}



