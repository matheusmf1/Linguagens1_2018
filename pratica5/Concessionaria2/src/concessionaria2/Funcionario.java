package concessionaria2;

public class Funcionario {

    protected String nome;
    private String senha;
    
    protected double salarioBase;
    private static double bonusExtra;
    private static double aliquotaBonus = 0.05;
    
    //protected String cpf;
    
   //private double vendaFun;

    
    public Funcionario(String nome, double salarioBase){
       
        this.nome = nome;
        this.salarioBase = salarioBase;

    }
    
    
    public static void calcularBonusExtra(double vendasTotais, double nFuncionarios){
        Funcionario.bonusExtra = (vendasTotais*aliquotaBonus)/nFuncionarios;
    }
    
    
    public boolean autentica(String senha){
        if (this.senha == senha){
            System.out.println("Acesso permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }
    
    
     public void setSalarioBase(double salario, String senha){
        
        if(autentica(senha)){
            this.salarioBase = salario;
        }

    }


    public static double getBonusExtra(){
        return Funcionario.bonusExtra;
    }
    
    public double getSalarioBase(){
        return this.salarioBase;
    }

   
}
