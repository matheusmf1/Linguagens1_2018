package br.maua.matheus.multiplastelas_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void mudarDeTela(View view) {
        //isso eh para mandar para outra tela
        EditText etTexto = (EditText) findViewById(R.id.etTexto);
        //Chama explicita de intent
        Intent intent = new Intent(this,Tela2Activity.class);
        intent.putExtra("MENSAGEM_OLA",etTexto.getText().toString());
        startActivity(intent);

    }
}
