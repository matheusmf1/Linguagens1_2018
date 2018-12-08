package com.example.alunoseprofessores.atividade4;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.room.Room;


/*
*
* Felipe Andrade    RA: 15.00175-0
* Gabriel Soares    RA: 16.00151-6
* Matheus Mandotti  RA: 16.00177-0
*
* */

public class MainActivity extends Activity {

    private static final int MY_PERMISSIONS_REQUEST = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (this.checkSelfPermission(Manifest.permission.CALL_PHONE)
                    != PackageManager.PERMISSION_GRANTED) {
                this.requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, MY_PERMISSIONS_REQUEST);
            }
        }

        if (!rootUserExists()) {
            createRootUser();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST:
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                } else {
                    System.exit(0);
                }
                break;
            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    private boolean rootUserExists() {
        AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "database-user")
                .allowMainThreadQueries()
                .build();

        Usuario usuario = db.getUsuarioDAO().findByLogin("raiz");

        if (usuario == null) {
            return false;
        }

        return true;
    }

    private void createRootUser() {
        AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "database-user")
                .allowMainThreadQueries()
                .build();

        db.getUsuarioDAO().insert(new Usuario("raiz","raiz", "ps4>>Xbox"));
    }

    public void logar(View view) {
        EditText login = (EditText) view.findViewById(R.id.usuarioLogin);
        EditText senha = (EditText) view.findViewById(R.id.usuarioSenha);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "database-user")
                .allowMainThreadQueries()
                .build();

        Usuario usuario = db.getUsuarioDAO().findByLogin(login.getText().toString());

        if (usuario == null) {
            Toast.makeText(getApplicationContext(), "Usuário nao cadastrado!", Toast.LENGTH_SHORT).show();
        }
        else if ( !usuario.getSenha().equals(senha.getText().toString()) ) {
            Toast.makeText(this, "Senha inválida!", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent intent = new Intent(this, ProdutoActivity.class);
            startActivity(intent);
        }
    }
}
