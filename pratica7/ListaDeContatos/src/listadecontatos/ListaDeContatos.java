package listadecontatos;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.LinkedList;

public class ListaDeContatos {

    private String nome;
    private int numero;
    private String email;

    private final LinkedList<Contato> listadecontatos = new LinkedList<Contato>();

    public void addContatos(String nome, int numero, String email) {
        this.nome = nome;
        this.numero = numero;
        this.email = email;
        Contato contato = new Contato(nome, numero, email);
        listadecontatos.add(contato);

    }

    public void getContatos() {
        Iterator<Contato> i = listadecontatos.iterator();
        Contato c;
        while (i.hasNext()) {
            c = i.next();
            System.out.println(c.getNome());
            System.out.println(c.getNumero());
            System.out.println(c.getEmail());
            System.out.println("--------------------");
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
                System.out.println("Contato encontrado: Nome: " + c.getNome());
            }
        }
    }
    
    public void search(int numero){
        Iterator<Contato> i = listadecontatos.iterator();
        Contato c;

        while (i.hasNext()) {
            boolean resp;
            c = i.next();
            if (c.getNumero() == numero) {
                System.out.println("Contato encontrado: Numero: " + c.getNumero());
            }
        }    
    }

}