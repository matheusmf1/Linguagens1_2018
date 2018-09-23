/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapas;

import java.util.Comparator;

/**
 *
 * @author Matheus
 */
public class Dados implements Comparable {
    
    private int id;
    private String nome;
    
    public Dados(int id,String nome){
        this.id = id;
        this.nome = nome;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
    
    @Override
    public String toString(){
        return "ID: " + getId() + " Nomes: " + getNome();
    
    }

    @Override
    public int compareTo(Object o) {
        Dados d = (Dados) o;
        
        if(this.getId() > d.getId())
            return 1;
        else if(this.getId() == d.getId())
            return 0;
        else
            return -1;
    }
    
    @Override
    public int hashCode(){
        return this.getId() + this.getNome().length();
    }
}
