package br.maua.matheus.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicar(View view) {

        TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
        EditText etValor1 = (EditText) findViewById(R.id.etValor1);
        EditText etValor2 = (EditText) findViewById(R.id.etValor2);

        try {
            double valor1 = Double.parseDouble(etValor1.getText() + "");
            double valor2 = Double.parseDouble(etValor2.getText() + "");

            switch (view.getId()){

                case R.id.bsoma:
                    tvResultado.setText("Resultado " + (valor1 + valor2));
                    break;

                case R.id.bmenos:
                    tvResultado.setText("Resultado " + (valor1 - valor2));
                    break;

                case R.id.bdivi:
                    tvResultado.setText("Resultado " + (valor1 / valor2));
                    break;

                case R.id.bmult:
                    tvResultado.setText("Resultado " + (valor1 * valor2));
                    break;
            }


        } catch (Exception e){

            Toast.makeText(this, "Voce digitou um valor invalido!\n" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }
}
