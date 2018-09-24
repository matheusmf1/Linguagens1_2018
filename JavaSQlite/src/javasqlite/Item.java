/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasqlite;

/**
 *
 * @author Matheus
 */
public class Item {
    
    private int id;
    private int count;
    private String name;
    private double price;
    
    public Item(int id, int count, String name, double price){
        setCount(count);
        setName(name);
        setPrice(price);
        setId(id);        
    }
    
    @Override
    public String toString() {
        String retorno = "\nName: "+getName()+ " ID: " + getId();
        retorno += "\nPrice: "+getPrice() + " Count: "+getCount();
        return retorno;
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
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
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
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
