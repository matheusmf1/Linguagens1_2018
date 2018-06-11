/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

import java.util.LinkedList;

/**
 *
 * @author 15.00175-0
 */
public abstract class ListaDeProdutos {
    private int restantes;
    private LinkedList<Produto> listaDeProdutos;
    
    public ListaDeProdutos(int maxRestantes) {
        this.listaDeProdutos = new LinkedList<>();
        this.restantes = maxRestantes;
    }
    
    public boolean adicionarALista(Produto produto) {
        boolean valorRetorno = false;

        if (this.getRestantes() > 0) {
            this.getListaDeProdutos().add(produto);
            this.setRestantes(this.getRestantes() - 1);
            valorRetorno = true;
        }
        
        return valorRetorno;
    }
    
    public void limparLista() {
        this.getListaDeProdutos().clear();
    }
    
    public int getRestantes() {
        return this.restantes;
    }
    
    public boolean removerUltimoDaLista() {
        boolean valorRetorno = false;
        
        if (this.getListaDeProdutos().size() > 0) {
            this.getListaDeProdutos().removeLast();
            this.setRestantes(this.getRestantes() + 1);
            valorRetorno = true;
        }
        
        return valorRetorno;
    }
    
    public String retornarResumo() {
        StringBuilder temp = new StringBuilder();
        for (Produto produto : this.getListaDeProdutos())
            temp.append(produto.exibirInfos());
        
        return temp.toString();
    }

    /**
     * @param restantes the restantes to set
     */
    public void setRestantes(int restantes) {
        this.restantes = restantes;
    }

    /**
     * @return the listaDeProdutos
     */
    public LinkedList<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    /**
     * @param listaDeProdutos the listaDeProdutos to set
     */
    public void setListaDeProdutos(LinkedList<Produto> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }
}
