package br.maua.matheus.meuprimeiroapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void apertar(View view){
     //view eh o componente que chamou a funcao apertar
        TextView tv = (TextView) findViewById(R.id.tvNome);
        EditText etNome = (EditText) findViewById(R.id.etNome);
        String texto = "Ola " + etNome.getText();
        tv.setText(texto);
        etNome.setText("");
    }
}
