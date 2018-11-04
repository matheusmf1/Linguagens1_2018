package br.maua.matheus.retomada_listview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import androidx.room.Room;

public class MainActivity extends Activity {

    ListView lista;
    List<ItemParaMostrar> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializa();
       // atualizaLista();
    }

    @Override
    protected void onResume() {
        super.onResume();
        atualizaLista();
    }

    private void atualizaLista() {

//        ADAPTER SIMPLES
//        ArrayAdapter adapter = new ArrayAdapter<ItemParaMostrar>(this,android.R.layout.simple_list_item_1,items);

//        ADAPTER MODIFICADO
//        AdapterItemParaMostrar adapter = new AdapterItemParaMostrar(this, items);
//        lista.setAdapter(adapter);


//      PEGA A LISTA DO BANCO  ---- databaseBuilder(contexto, classe que tem que mostrar, nome da base de dados)
        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class,"data-name").allowMainThreadQueries().build();

        items = db.getDao().getAll();
        AdapterItemParaMostrar adapter = new AdapterItemParaMostrar(this,items);
        lista.setAdapter(adapter);
    }


    private void inicializa() {
        lista = (ListView) findViewById(R.id.lista_elementos);
        items = new ArrayList<>();

//        items.add(new ItemParaMostrar("RED DEAD2",1,199.99));
//        items.add(new ItemParaMostrar("Pikachu i choose you!",1,320.0));
//        items.add(new ItemParaMostrar("Poster Vegeta",4,200.90));

    }

    public void chamarCadastrar(View view) {
        //chamada explicita, quero mudar de tela.
        Intent intent = new Intent(this,CadastartActivity.class);
      //  startActivityForResult(intent,100);
        startActivity(intent);
    }


//    nao faz mais sentido, nao espera-se ninguem para terminar para ver ele
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        //verifoica se o botao foi apertado para ir na tela desejada
//        if(requestCode == 100 && resultCode == Activity.RESULT_OK){
//            ItemParaMostrar item;
//            item = (ItemParaMostrar) data.getSerializableExtra("OBJETO");
//            items.add(item);
//            atualizaLista();
//        }
//
//    }
}
