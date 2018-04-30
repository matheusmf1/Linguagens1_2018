package concessionaria;


public class Gerente {
    
    Funcionarios funcionario;

    
   public Gerente(double salarioBase){
       this.funcionario = new Funcionarios(salarioBase);
   
   }
    
   public void darAumento(Vendedor v, double aumento){   
        v.funcionario.salarioBase += aumento;
   }
   
   public double calculaComissao(){
       return 0.1 * funcionario.getVendaFun() + 0.5 * funcionario.getSalarioBase();
   
   }
   
   public double getSalarioTotalGerente(){
       
       return this.funcionario.getSalarioBase() + this.calculaComissao();
   
   }
   
}

