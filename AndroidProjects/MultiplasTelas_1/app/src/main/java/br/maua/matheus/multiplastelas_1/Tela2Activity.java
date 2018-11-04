package br.maua.matheus.multiplastelas_1;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Tela2Activity extends Activity {

    private static final int MY_PERMISSIONS_REQUEST = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        //isso faz com que a mensagem da tela1 venha para a tela2
        //esse intent so existe quando vai da tela1 para 2, se deixar fechar o app e voltar ele rodará o onResume
        // o qual nao tem uma intent instanciada


        Intent intent = getIntent();
        String msg = intent.getStringExtra("MENSAGEM_OLA");
        //pop-up
        Toast.makeText(getApplicationContext(),
                getString(R.string.hello_msg) + msg,
                Toast.LENGTH_SHORT).show();

    }


    public void chamarDial(View view) {
        //chamada implicita de intent
        Intent intent = new Intent(Intent.ACTION_DIAL);
        startActivity(intent);
    }

    public void enviarMsg(View view) {
        try {
            //Chamada implicita de intent
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setType("text/plain");
            startActivity(intent);
            //somente isso da erro
        } catch (Exception e) {
            //pop-up --> toast
            Toast.makeText(getApplicationContext(),
                    getString(R.string.naoTemActivity),Toast.LENGTH_SHORT).show();
        }
    }
}
