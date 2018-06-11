package listadecompras;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.LinkedList;

public class ListaDeProdutos {
    
    private static int totalDeProdutos;
    private final LinkedList<Produto> listadeprodutos = new LinkedList<Produto>();

    public void addProdutos(String nome,double preco) {
        Produto produto = new Produto(nome,preco);
        listadeprodutos.add(produto);
        ListaDeProdutos.totalDeProdutos ++;
        

    }

    private void showProduto(Produto c) {
        System.out.println("Nome: " + c.getNome());
        System.out.printf("Preco: %.2f\n", c.getPreco());
        System.out.println("--------------------");
    }
    
    public void getProdutos() {
        Iterator<Produto> i = listadeprodutos.iterator();
        Produto c;
        while (i.hasNext()) {
            c = i.next();
            showProduto(c);
        }
    }

    public void deleteProduto(String produto) {
        ListIterator<Produto> i = listadeprodutos.listIterator();
        Produto c;
        int count = 0;
        while (i.hasNext()) {
            c = i.next();
            if (c.getNome().equals(produto)) {
                i.remove();
                ListaDeProdutos.totalDeProdutos-=1;
            }
            count += 1;
            
        }
    }

    public void search(String nome) {
        Iterator<Produto> i = listadeprodutos.iterator();
        Produto c;
        
        while (i.hasNext()) {
            boolean resp;
            c = i.next();
            resp = c.getNome().equalsIgnoreCase(nome);
            if (resp) {
                System.out.println("Produto encontrado no seu carrinho: ");
                showProduto(c);
            }
        }
    }
    
    public void buscaPreco(double preco){
        Iterator<Produto> i = listadeprodutos.iterator();
        Produto c;
        while (i.hasNext()) {
            c = i.next();
            if (c.getPreco() == preco) {
                System.out.println("Produto encontrado por seu preco: ");
                showProduto(c);              
            }
        }    
    }

    /**
     * @return the totalDeProdutos
     */
    public static void getTotalDeProdutos() {
        System.out.println("Numero de itens no carrinho: " + ListaDeProdutos.totalDeProdutos);
    }
  

}


