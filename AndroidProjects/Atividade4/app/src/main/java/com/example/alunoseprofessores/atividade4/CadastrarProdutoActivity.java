package com.example.alunoseprofessores.atividade4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.room.Room;

public class CadastrarProdutoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_produto);
    }

    public void adicionar(View view) {
        EditText etNome = (EditText) findViewById(R.id.etNome);
        EditText etValor = (EditText) findViewById(R.id.etValor);
        EditText etTipo = (EditText) findViewById(R.id.etTipo);

        Produto produto = new Produto();
        produto.setNome(etNome.getText().toString());

        produto.setTipo(etTipo.getText().toString());

        double valor = Double.parseDouble(etValor.getText().toString());
        produto.setValor(valor);

        Intent intent = new Intent();
        intent.putExtra("OBJETO", produto);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class,"data-name"). allowMainThreadQueries().build();

        db.getProdutoDAO().insert(produto);

        finish();
    }
}
