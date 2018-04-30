package concessionaria;


public class Vendedor {
    
    Funcionarios funcionario;
    private Gerente gerente;
    
    public Vendedor(double salarioBase, Gerente gerente){
           this.funcionario = new Funcionarios(salarioBase);
           this.gerente = new Gerente(salarioBase);
    }
  
}
