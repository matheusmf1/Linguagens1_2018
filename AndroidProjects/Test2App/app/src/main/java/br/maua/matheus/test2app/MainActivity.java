package br.maua.matheus.test2app;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    final private String ID_MENSAGEM_LOGCAT = "MIA_KHALIFA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //eh o primeiro metodo executado quando a activity eh lancada
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(ID_MENSAGEM_LOGCAT, "De dentro do onCreate()");

        //depois que executado ele cria todas as instancias e executa o onStart
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(ID_MENSAGEM_LOGCAT, "Dentro do onStart");
//        Log.i(ID_MENSAGEM_LOGCAT, "Dentro do onStart"); //roda no info
        //executa toda vez que executar o app
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(ID_MENSAGEM_LOGCAT, "Mensagem dentro do OnResume");
        //toda vez que mara a aplicacao ele executa o onResume quando volta
    }

    //obedece o ciclo de vida


}
