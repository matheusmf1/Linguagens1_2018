/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

/**
 *
 * @author 15.00175-0
 */
public class Pedido {
    private Cliente cliente;
    private ListaDeCompras listaDeProdutos;
    private int numeroPedido;
    
    public Pedido(Cliente cli , ListaDeCompras carrinho ) {
        if (carrinho.getId() >= 0) {
            this.cliente = cli;
            this.listaDeProdutos = carrinho;
        }
        else {
            System.out.println("Não foi possivel finalizar o pedido.\n");
        }
    }
    
    public String resumoPedido() {
        StringBuilder str = new StringBuilder();
        
        str.append("===============================================\n");
        str.append("================= VALEEUUUUUU =================\n");
        str.append("===============================================\n");
        str.append(String.format("Senhor %s, seu pedido foi gerado com sucesso.\n", this.cliente.getNome()));
        str.append(this.cliente.getNome());
        str.append("\n");

        str.append(this.cliente.getCpf());
        str.append("\n");

        str.append(String.format("Número do pedido: %d\n", 0));
        str.append(String.format("Endereço de entrega: %s - %s\n",  this.cliente.getEndereco(), this.cliente.getCep()));
        str.append("Resumo da compra.\n");
        str.append("\n");
        str.append(String.format("Você comprou %d iten(s).\n", this.listaDeProdutos.getQtdProdutos()));
        str.append(this.listaDeProdutos.retornarResumo());
        str.append(String.format("Um boleto foi enviado para o email %s. Obrigado pela preferência! :D\n", this.cliente.getEmail()));
        str.append("===============================================\n");

        return str.toString();
    }
}
