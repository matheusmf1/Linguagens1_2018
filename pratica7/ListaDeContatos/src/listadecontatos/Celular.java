package listadecontatos;

public class Celular {

    public static void main(String[] args) {
       
      ListaDeContatos l1 = new ListaDeContatos();
      
      
      // Adiciona contatos a lista de contatos
      l1.addContatos("Matheus", 975707752, "teste");
      l1.addContatos("Joao", 24414284, "teste2");
      l1.addContatos("Joao2", 24414284, "teste2");
      l1.addContatos("Rivaldo", 36322722,"teste3");
      
      //Visualiza a lista de contatos
      l1.getContatos();
      
      //Faz uma busca
      l1.search("Joao2");
      l1.search(975707752);
      
      //deleta contatos
      l1.deleteContato("Matheus");
      
      System.out.println("----------------------");
      
      l1.getContatos();

    }
    
}
