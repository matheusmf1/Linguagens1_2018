package aula4;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    
    
    //construtor
    public Cliente(String nome,String sobrenome, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
  
    }
    
    
    public String getNome(){
        return nome;
    }
    
    public void mudarCPF(String cpf){
        if(validarCPF(cpf)){
            this.cpf = cpf;
        } else {
            System.out.println("Não foi possivel alterar o CPF.");
            }
        }
    
    
    private boolean validarCPF(String cpf){
        
        
        
        return true; 
    }
  
}
