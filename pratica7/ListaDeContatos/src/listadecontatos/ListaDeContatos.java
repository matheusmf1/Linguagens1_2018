package listadecontatos;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.LinkedList;

public class ListaDeContatos {

    private final LinkedList<Contato> listadecontatos = new LinkedList<Contato>();

    public void addContatos(String nome, int numero, String email) {
        Contato contato = new Contato(nome, numero, email);
        listadecontatos.add(contato);

    }

    private void showContato(Contato c) {
        System.out.println("Nome: " + c.getNome());
        System.out.println("Numero: " + c.getNumero());
        System.out.println("Email: " + c.getEmail());
        System.out.println("--------------------");
    }
    
    public void getContatos() {
        Iterator<Contato> i = listadecontatos.iterator();
        Contato c;
        while (i.hasNext()) {
            c = i.next();
            showContato(c);
        }
    }

    public void deleteContato(String contato) {
        ListIterator<Contato> i = listadecontatos.listIterator();
        Contato c;
        int count = 0;
        while (i.hasNext()) {
            c = i.next();
            if (c.getNome().equals(contato)) {
                i.remove();
            }
            count += 1;
        }
    }

    public void search(String nome) {
        Iterator<Contato> i = listadecontatos.iterator();
        Contato c;
        
        while (i.hasNext()) {
            boolean resp;
            c = i.next();
            resp = c.getNome().equalsIgnoreCase(nome);
            if (resp) {
                System.out.println("Contato encontradom pelo nome: ");
                showContato(c);
            }
        }
    }
    
    public void search(int numero){
        Iterator<Contato> i = listadecontatos.iterator();
        Contato c;
        while (i.hasNext()) {
            c = i.next();
            if (c.getNumero() == numero) {
                System.out.println("Contato encontrado pelo numero: ");
                showContato(c);              
            }
        }    
    }

}