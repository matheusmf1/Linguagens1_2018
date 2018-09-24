/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atividade3;

/**
 *
 * @author 15.00175-0
 */
public class Produto {
    private String code;
    private String name;
    private double price;
    private int quant;
    private String fab;
    private String categ;

    public Produto(String code, String name, double price, int quant, String fab, String categ) {
        this.setCode(code);
        this.setName(name);
        this.setPrice(price);
        this.setQuant(quant);
        this.setFab(fab);
        this.setCateg(categ);
    }
    
    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return the quant
     */
    public int getQuant() {
        return quant;
    }

    /**
     * @param quant the quant to set
     */
    public void setQuant(int quant) {
        this.quant = quant;
    }

    /**
     * @return the fab
     */
    public String getFab() {
        return fab;
    }

    /**
     * @param fab the fab to set
     */
    public void setFab(String fab) {
        this.fab = fab;
    }

    /**
     * @return the categ
     */
    public String getCateg() {
        return categ;
    }

    /**
     * @param categ the categ to set
     */
    public void setCateg(String categ) {
        this.categ = categ;
    }
    
    @Override
    public String toString() {
        return "Código: " + this.getCode() + "; Nome: " + this.getName() + "; Preço: " + this.getPrice() +
               "; Quantidade: " + this.getQuant() + "; Fabricante: " + this.getFab() + "; Categoria: " + this.getCateg() + "\n";
    }
}
