package br.maua.matheus.intenscomuns;

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

public class MainActivity extends Activity {
    private static final int MY_PERMISSIONS_REQUEST = 100;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Pede permissão para o usuário
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (this.checkSelfPermission(Manifest.permission.CALL_PHONE)
                    != PackageManager.PERMISSION_GRANTED) {
                this.requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, MY_PERMISSIONS_REQUEST);
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST:
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    AvisaUsuario(getApplicationContext(), "Aeeeee");
                } else {
                    System.exit(0);
                }
                break;
            default:
                super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    public void callDial(View view){


        //PAREI AQUI

        EditText etTelefone = (EditText) findViewById(R.id.etTelefone);
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"+etTelefone.getText()));
        try {
            startActivity(intent);
        }
        catch (Exception e){
            AvisaUsuario(this, "Não foi possível rodar sua aplicação, pois: " + e.getMessage());
        }
    }

    public void callPhone(View view){
        EditText etTelefone = (EditText) findViewById(R.id.etTelefone);
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:"+etTelefone.getText()));
        try {
            startActivity(intent);
        }
        catch (Exception e){
            AvisaUsuario(this, "Não foi possível rodar sua aplicação, pois: " + e.getMessage());
        }
    }

    public void AvisaUsuario(Context context, String msg){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
    }
}
