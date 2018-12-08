package com.example.alunoseprofessores.atividade4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.room.Room;

public class RealizarVendaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realizar_venda);
    }

    public void vender(View view) {
        EditText etNome = (EditText) findViewById(R.id.etNome);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class,"data-name"). allowMainThreadQueries().build();

        Produto produto = db.getProdutoDAO().findByName(etNome.getText().toString());

        if (produto == null) {
            Toast.makeText(this, "Produto inexistente!", Toast.LENGTH_SHORT).show();
        }
        else {
            db.getProdutoDAO().delete(produto);
            Toast.makeText(this, "Venda realizada!", Toast.LENGTH_SHORT).show();
        }
    }
}
