package aula4;

public class Conta {
    
    String numeroConta; 
    private double saldo;
    Cliente cliente;
    
    //construtor
    public Conta (String nConta, double saldo, String nome, String sobrenome, String cpf ){
        
        this.saldo = saldo;
        this.numeroConta = nConta;
        this.cliente = new Cliente(nome, sobrenome, cpf);
 
    }
    
 
    public String visualizarSaldo(){
  
        return Double.toString(this.saldo);
        //devolve string
        
    }
    
    public double getSaldo() {
        
        return this.saldo;
        //retorna um double
      
    }
    
    public boolean depositar(double valor){
        if(valor <= 0){
            System.out.println("Nada a depositar");
            return false;
        } else {
            this.saldo += valor;
            return true;
        }
        
    }
    
    public boolean sacar(float valor){
        boolean resp = false;
        if(this.saldo >= valor) {
           
            
            this.saldo = this.saldo - valor;
            resp = true;
        }
        return resp;
    }
 

    public boolean transferirDinheiro(Conta destinatario, float valor){
        boolean resp = false;
        if(this.sacar(valor)){  
            destinatario.depositar(valor);
            resp = true;
        }
        return resp;
    }
    
    
    
    
    public String getnumeroConta (){
        
        return this.numeroConta;
    
    }

}

