/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 15.00175-0
 */
public class ListaDeCompras extends ListaDeProdutos implements Compravel {
    private int qtdProdutos;
    private int id;
    private static int numeroPedido;
    
    public ListaDeCompras() {
        super(12);
        this.id = numeroPedido++;
    }
    
    @Override
    public int getId() {
        return this.id;
    }
     
    public int getQtdProdutos() {
        return qtdProdutos;
    }
    
    @Override
    public boolean adicionarALista(Produto produto) {
        boolean valorRetorno = false;

        if (this.getRestantes() > 0) {
            this.getListaDeProdutos().add(produto);
            this.setRestantes(this.getRestantes() - 1);
            this.qtdProdutos++;
            valorRetorno = true;
        }
        
        return valorRetorno;
    }
    
    @Override
    public boolean removerUltimoDaLista() {
        boolean valorRetorno = false;
        
        if (this.getListaDeProdutos().size() > 0) {
            this.getListaDeProdutos().removeLast();
            this.setRestantes(this.getRestantes() + 1);
            this.qtdProdutos--;
            valorRetorno = true;
        }
        
        return valorRetorno;
    }
}
