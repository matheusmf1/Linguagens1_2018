
package concessionaria;

public class Funcionarios {
    
    private double salarioBase;
    private double vendaFun;
    
    private static double totalVendas;
    private static int funcionarios;

   
    
    
    public Funcionarios(double salarioBase){
       
        this.salarioBase = salarioBase;
        Funcionarios.funcionarios++;

    }
    
    public static int getNumeroFuncionarios(){
        
        return Funcionarios.funcionarios;

    }
   
    public void venda(double valor){
        
        Funcionarios.totalVendas += valor;
        this.vendaFun += valor;
        
    }    
    
   public double getVendaFun(){
   
       return this.vendaFun;
   
   } 
   public static double getVendas(){
        
     return Funcionarios.totalVendas;
                
    }
    
    public double getSalarioBase(){
        return this.salarioBase;
    }
    
    private double getComissao(){
        
        return Funcionarios.totalVendas*(0.05)/Funcionarios.funcionarios;
    
    }
    
    public double getSalarioMes(){
        
         return this.salarioBase + getComissao();
    }


    
}
    

