package listadecompras;

public class Produto {
    
    private String nome;
    private double preco;
    
   
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;      
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }
    
   
    
}

    