package com.example.alunoseprofessores.atividade4;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import androidx.room.Room;

public class ProdutoActivity extends Activity {

    private static final int MY_PERMISSIONS_REQUEST = 100;
    ListView listView;
    List<Produto> listaProduto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);

        this.inicializa();
    }

    @Override
    protected void onResume() {
        super.onResume();

        this.atualizaLista();
    }

    private void inicializa() {
        this.listView = (ListView) findViewById(R.id.listaProduto);
        this.listaProduto = new ArrayList<>();
    }

    private void atualizaLista() {
        AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "database-user")
                .allowMainThreadQueries()
                .build();

        this.listaProduto = db.getProdutoDAO().getAll();

        AdapterProduto adapter = new AdapterProduto(this, this.listaProduto);

        this.listView.setAdapter(adapter);
    }

    public void cadastrarProduto(View view) {
        Intent intent = new Intent(this, CadastrarProdutoActivity.class);
        startActivityForResult(intent, 100);
    }

    public void cadastrarUsuario(View view) {
        Intent intent = new Intent(this, CadastrarUsuarioActivity.class);
        startActivityForResult(intent, 100);
    }

    public void realizarVenda(View view) {
        Intent intent = new Intent(this, RealizarVendaActivity.class);
        startActivityForResult(intent, 100);
    }

    public void chamarPolicia(View view) {
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:911"));

        try {
            startActivity(intent);
        }
        catch (Exception e) {
            Toast.makeText(this,"Nao foi possível realizar a ligacao, pois " +e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

}
