/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendagui;

/**
 *
 * @author Matheus
 */
public class Contato {
    
    private String nome;
    private String email;
    private String telefone;
    private String facebook;
    private String instagram;
    private String foto;
    private String geolocalizacao;

    public Contato(String nome){
        this.nome = nome;
    }
    
    @Override
    public String toString(){       
        String retorno;
        retorno = nome + '\n';
        retorno += "Email: " + this.email +  "\nTelefone: " + this.telefone;
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
        System.out.println("Set name");
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
        this.email = email;
        System.out.println("Set email");
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
        this.telefone = telefone;
        System.out.println("Set telefone");
    }

    /**
     * @return the facebook
     */
    public String getFacebook() {
        return facebook;
    }

    /**
     * @param facebook the facebook to set
     */
    public void setFacebook(String facebook) {
        this.facebook = facebook;
        System.out.println("Set facebook");
    }

    /**
     * @return the instagram
     */
    public String getInstagram() {
        return instagram;
    }

    /**
     * @param instagram the instagram to set
     */
    public void setInstagram(String instagram) {
        this.instagram = instagram;
        System.out.println("Set instagram");
    }

    /**
     * @return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
        System.out.println("Set photo");
    }

    /**
     * @return the geolocalizacao
     */
    public String getGeolocalizacao() {
        return geolocalizacao;
    }

    /**
     * @param geolocalizacao the geolocalizacao to set
     */
    public void setGeolocalizacao(String geolocalizacao) {
        this.geolocalizacao = geolocalizacao;
        System.out.println("Set geo");
    }
}
