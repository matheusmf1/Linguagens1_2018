package concessionaria2;

public abstract class Funcionario {

    private String nome;
    private double salarioBase;
    private double salarioMes;
    
    public static int nFuncionario;
    private static double bonusExtra;
    
    protected static double totalDeVendas;
    
  
 
    
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

    protected void setSalarioBase(double salario) {
        this.salarioBase = salario;
           
        }
    
  
       
    public static double getBonusExtra() {
        Funcionario.bonusExtra = ((Funcionario.totalDeVendas * 0.05) / Funcionario.nFuncionario);
//        System.out.println("Bonus Extra eh de: " + Funcionario.bonusExtra);
        return Funcionario.bonusExtra;

    }

}



