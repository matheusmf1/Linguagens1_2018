package com.example.alunoseprofessores.atividade4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.room.Room;

public class CadastrarUsuarioActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_usuario);
    }

    public void adicionar(View view) {
        EditText etNome = (EditText) findViewById(R.id.etNome);
        EditText etLogin = (EditText) findViewById(R.id.etLogin);
        EditText etSenha = (EditText) findViewById(R.id.etSenha);

        Usuario usuario = new Usuario();
        usuario.setNome(etNome.getText().toString());
        usuario.setLogin(etLogin.getText().toString());
        usuario.setSenha(etSenha.getText().toString());

        Intent intent = new Intent();
        intent.putExtra("OBJETO", usuario);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class,"data-name"). allowMainThreadQueries().build();

        db.getUsuarioDAO().insert(usuario);

        finish();
    }
}
