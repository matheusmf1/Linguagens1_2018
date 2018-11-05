package br.maua.matheus.lista;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListaActivity extends Activity {

    private ListView lista;
    private List<Pedido> listaDePedidos;
    private static final int REQUEST_DETALHES = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
//        CRIA A LISTA QUANDO O APP EH INICIALIZADO
        listaDePedidos = new ArrayList<>();
        lista = (ListView) findViewById(R.id.listaPedidos);

        insereDummyData();
        atualizaLista();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == REQUEST_DETALHES){
            Pedido p = (Pedido) data.getSerializableExtra("OBJETO");
            listaDePedidos.add(p);
            atualizaLista();
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    private void insereDummyData(){
        Pedido p = new Pedido();
        p.setHardware(false);
        p.setNome("Red Dead Redemption 2");
        p.setPreco(199.99);
        p.setPlataforma("PS4");
        listaDePedidos.add(p);

        p = new Pedido();
        p.setHardware(false);
        p.setNome("Devil May Cry 5");
        p.setPreco(199.99);
        p.setPlataforma("PC");
        listaDePedidos.add(p);

        p = new Pedido();
        p.setHardware(true);
        p.setNome("Macbook pro");
        p.setPreco(19999.99);
        p.setPlataforma("Apple");
        listaDePedidos.add(p);

    }

    private void atualizaLista(){
        ArrayAdapter adapter = new ArrayAdapter<Pedido>(
                this,android.R.layout.simple_list_item_1, listaDePedidos);
        lista.setAdapter(adapter);
    }

    public void mudarTela(View view) {
        Intent intent = new Intent(this, DetalhesActivity.class);
        startActivityForResult(intent, REQUEST_DETALHES);
    }
}
