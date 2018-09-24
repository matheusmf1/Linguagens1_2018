/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosql;

/**
 *
 * @author murilo
 */
public class Animal {

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
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the localizacao
     */
    public Localizacao getLocalizacao() {
        return localizacao;
    }

    /**
     * @param localizacao the localizacao to set
     */
    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }
    
    public Animal(String nome, String tipo, double peso, double lat, double lon){
        setNome(nome);
        setPeso(peso);
        setTipo(tipo);
        setLocalizacao(new Localizacao(lat, lon));
    }

    @Override
    public String toString() {
        return getNome()+"\t"+getTipo();
    }
    
    public Animal(){
        
    }
    
    
    private String nome;
    private String tipo;
    private double peso;
    private Localizacao localizacao;
    
}
