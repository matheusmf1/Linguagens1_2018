package br.maua.matheus.lista;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class DetalhesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);
    }

    public void enviarDados(View view) {
        CheckBox cbHardware = (CheckBox) findViewById(R.id.cbHardware);
        EditText etNome = (EditText) findViewById(R.id.etNome);
        EditText etPlataforma = (EditText) findViewById(R.id.etPlataforma);
        EditText etPreco = (EditText) findViewById(R.id.etPreco);

        Pedido p = new Pedido();

        p.setNome(etNome.getText().toString());
        p.setPlataforma(etPlataforma.getText().toString());
        p.setPreco(Double.parseDouble(etPreco.getText().toString()));
        p.setHardware(cbHardware.isChecked());

        //DEVOLVE O OBJETO

        Intent intent = new Intent();
        intent.putExtra("OBJETO",p);
        setResult(Activity.RESULT_OK,intent);
        finish();

    }
}
