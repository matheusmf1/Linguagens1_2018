package com.example.murilo.primeirotesteroom;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.room.Room;

public class CadastroActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //so instacia a classe
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void colocarNoBanco(View view) {
        //declara um novo user
        Usuario usuario = new Usuario();

        EditText nome = (EditText) findViewById(R.id.etNome);
        EditText telefone = (EditText) findViewById(R.id.etTelefone);
        EditText email = (EditText) findViewById(R.id.etEmail);

        usuario.setEmail(email.getText().toString());
        usuario.setNome(nome.getText().toString());
        usuario.setTelefone(telefone.getText().toString());

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),AppDatabase.class, "database-name").
                allowMainThreadQueries().build();

        //insere no banco
        db.usuarioDAO().insert(usuario);
        finish();
    }
}
