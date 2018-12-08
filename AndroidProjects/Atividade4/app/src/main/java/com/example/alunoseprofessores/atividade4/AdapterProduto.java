package com.example.alunoseprofessores.atividade4;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterProduto extends BaseAdapter {

    List<Produto> listaProduto;
    Activity activity;

    public AdapterProduto(Activity activity, List<Produto> listaProduto) {
        this.activity = activity;
        this.listaProduto = listaProduto;
    }

    @Override
    public int getCount() {
        return this.listaProduto.size();
    }

    @Override
    public Object getItem(int position) {
        return this.listaProduto.get(position);
    }

    @Override
    public long getItemId(int position) {
        return this.listaProduto.indexOf(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View myView;

        myView = activity.getLayoutInflater().inflate(R.layout.layout_produtos, parent, false);

        Produto produto = listaProduto.get(position);

        TextView nome = (TextView) myView.findViewById(R.id.nomeProduto);
        TextView tipo = (TextView) myView.findViewById(R.id.tipoProduto);
        TextView valor = (TextView) myView.findViewById(R.id.valorProduto);
        ImageView img = (ImageView) myView.findViewById(R.id.imageProduto);

        switch (tipo.getText().toString().toLowerCase()) {
            case "cavalo":
                img.setImageResource(R.drawable.horse);
                break;
            case "alimentos":
                img.setImageResource(R.drawable.food);
                break;
            case "acampamento":
                img.setImageResource(R.drawable.camp);
        }

        nome.setText(produto.getNome());
        tipo.setText("Tipo: " + produto.getTipo());
        valor.setText("Valor: " + produto.getValor());

        return myView;
    }
}
