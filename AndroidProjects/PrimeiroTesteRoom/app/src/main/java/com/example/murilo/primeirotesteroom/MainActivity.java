package com.example.murilo.primeirotesteroom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import androidx.room.Room;

public class MainActivity extends Activity {

    //Banco utilizado pela classe
    AppDatabase db;
    ListView lista;
    List<Usuario> usuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Cria a instância do banco
        db = Room.databaseBuilder(getApplicationContext(),AppDatabase.class, "database-name").
                allowMainThreadQueries().build();
        lista = (ListView) findViewById(R.id.lista_dados);
    }

    @Override
    protected void onResume() {
        super.onResume();
        atualizarLista();
    }

    public void adicionar(View view) {
        //abre a outra activity
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
    }

    public void atualizarLista(){
        //Pega os dados do banco e coloca na lista
        usuarios = db.usuarioDAO().getAll();

        ArrayAdapter<Usuario> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, usuarios);

        lista.setAdapter(adapter);
    }
}
