package br.maua.matheus.retomada_listview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.room.Room;

public class CadastartActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastart);
    }

    public void adicionar(View view) {

        EditText etNome = (EditText) findViewById(R.id.etNome);
        EditText etValor = (EditText) findViewById(R.id.etValor);
        EditText etQuantidade = (EditText) findViewById(R.id.etQuantidade);

        ItemParaMostrar item = new ItemParaMostrar();
        item.setNome(""+ etNome.getText());

        int quantidade = Integer.parseInt(etQuantidade.getText().toString());
        item.setQuantidade(quantidade);

        double valor = Double.parseDouble(etValor.getText().toString());
        item.setValor(valor);

        Intent intent = new Intent();
        intent.putExtra("OBJETO",item);


//      COLOCA NO BANCO
        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class,"data-name").allowMainThreadQueries().build();

        db.getDao().inserirItem(item);

       // setResult(Activity.RESULT_OK,intent);

        finish();






    }
}
