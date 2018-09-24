/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botas;

/**
 *
 * @author Matheus
 */
public class Botas implements Comparable {

    /**
     * @param args the command line arguments
     */
    private int quantidade;
    private int numero;
    
    private String lado;
    
   
    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the lado
     */
    public String getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(String lado) {
        this.lado = lado;
    }
  
    @Override
    public String toString(){
        return "" + getNumero() + " " + getLado();
    
    }

    @Override
    public int compareTo(Object o) {
        Botas b = (Botas) o;
        
        if(this.numero > b.getNumero())
            return 1;
        else if(this.getNumero() == b.getNumero())
            return 0;
        else
            return -1;
    }
    
    @Override
    public int hashCode(){
        return this.getNumero() + this.getLado().length();
    }
    
    
}
