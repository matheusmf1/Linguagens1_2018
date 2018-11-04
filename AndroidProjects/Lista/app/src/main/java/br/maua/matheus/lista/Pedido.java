package br.maua.matheus.lista;

import java.io.Serializable;

public class Pedido implements Serializable {

    private String nome;
    private Double preco;
    private String plataforma;
    private boolean isHardware;

    @Override
    public String toString(){
        if(isHardware)
            return "Nome: "+getNome() + "\nPreco: " + getPreco();
        else
            return "\nNome: "+getNome() + "\nPlataforma: "+getPlataforma() + "\nPreco: " + getPreco();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public boolean isHardware() {
        return isHardware;
    }

    public void setHardware(boolean hardware) {
        isHardware = hardware;
    }
}
