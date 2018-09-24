package coleção.de.itens;

/**
 *
 * @author Matheus
 */
public class Usuario {
    
    private String nome;
    private String email;
    private String telefone;
    
    
    public Usuario(String nome, String email, String telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    
    @Override
    public String toString(){       
        String retorno;
        retorno = "Nome: " + this.nome + "\nEmail: " + this.email +  "\nTelefone: " + this.telefone;
        return retorno;
            
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        System.out.println("Email seted");
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        System.out.println("Telephone seted");
        this.telefone = telefone;
    }
    
    
}
