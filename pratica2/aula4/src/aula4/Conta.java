package aula4;

public class Conta {
    
    String numero;
    String titular;
    float saldo;
    String cfp;
    
    
    String visualizarSaldo(){
        
        return Float.toString(this.saldo);
        
    }
    
    boolean depositar(double valor){
        if(valor <= 0){
            System.out.println("Nada a depositar");
            return false;
        } else {
            this.saldo += valor;
            return true;
        }
        
    }
    
    boolean sacar(float valor){
        boolean resp = false;
        if(this.saldo >= valor) {
           
            
            this.saldo = this.saldo - valor;
            resp = true;
        }
        return resp;
    }
 

    boolean transferirDinheiro(Conta destinatario, float valor){
        boolean resp = false;
        if(this.sacar(valor)){  
            destinatario.depositar(valor);
            resp = true;
        }
        return resp;
    }
    
}

