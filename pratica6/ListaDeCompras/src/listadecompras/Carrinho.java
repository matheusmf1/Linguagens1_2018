package listadecompras;

public class Carrinho {


    public static void main(String[] args) {
        
       ListaDeProdutos l1 = new ListaDeProdutos();
      
      
      // Adiciona produtos a lista de produtos
      
      l1.addProdutos("Arroz", 11.50);
      l1.addProdutos("Feijão",8.50);
      l1.addProdutos("bolacha",3.19);
      l1.addProdutos("banana",6.99);
      l1.addProdutos("Refrigerante",7.99);
      
      
      //Faz uma busca na lista de produtos
      l1.search("Feijão");
      l1.buscaPreco(7.99);

      //deleta um produto
      l1.deleteProduto("bolacha");
      
      //Visualiza a lista de produtos
      l1.getProdutos();
      ListaDeProdutos.getTotalDeProdutos();

    }
    
}
