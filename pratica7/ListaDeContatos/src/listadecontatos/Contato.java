package listadecontatos;


public class Contato {

    private String nome;
    private int numero;
    private String email;

    public Contato(String nome,int numero,String email){
        
       this.nome = nome;
       this.numero = numero;
       this.email = email;
    }
    
 
    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getEmail() {
        return email;
    }

}
