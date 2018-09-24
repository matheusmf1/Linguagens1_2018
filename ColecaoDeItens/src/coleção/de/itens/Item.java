package coleção.de.itens;

/**
 *
 * @author Matheus
 */
public class Item {
    
    private String nome;
    private String ano;
    private String tipoDeMedia;
    private String plataforma;
    public static int id;
    
    public Item(String nome){
        this.nome = nome;
        Item.id++;
    }
    
    @Override
    public String toString(){       
        String retorno;
        retorno = "Nome: " + this.nome + "\niD: " + Item.id;
        return retorno;
            
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ano
     */
    public String getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(String ano) {
        this.ano = ano;
    }

    /**
     * @return the tipoDeMedia
     */
    public String getTipoDeMedia() {
        return tipoDeMedia;
    }

    /**
     * @param tipoDeMedia the tipoDeMedia to set
     */
    public void setTipoDeMedia(String tipoDeMedia) {
        this.tipoDeMedia = tipoDeMedia;
    }

    /**
     * @return the plataforma
     */
    public String getPlataforma() {
        return plataforma;
    }

    /**
     * @param plataforma the plataforma to set
     */
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    
}
