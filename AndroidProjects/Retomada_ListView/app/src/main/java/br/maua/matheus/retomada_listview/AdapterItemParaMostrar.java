package br.maua.matheus.retomada_listview;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class AdapterItemParaMostrar extends BaseAdapter {

    List<ItemParaMostrar> lista;
    Activity activity;

    public AdapterItemParaMostrar(Activity activity, List<ItemParaMostrar> lista){
        this.activity = activity;
        this.lista = lista;

    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int i) {
        return lista.get(i);
    }

    @Override
    public long getItemId(int i) {
        return lista.indexOf(lista.get(i));
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View nossoview;
        nossoview = activity.getLayoutInflater().inflate(R.layout.layout_items_view,viewGroup,false);
        ItemParaMostrar item = lista.get(i);
        ImageView imageView = (ImageView) nossoview.findViewById(R.id.listitem_image);
        TextView nome = (TextView) nossoview.findViewById(R.id.listitem_nome);
        TextView valor = (TextView) nossoview.findViewById(R.id.listitem_valor);
        TextView quantidade = (TextView) nossoview.findViewById(R.id.listitem_quantidade);

        nome.setText(item.getNome());
        quantidade.setText("Quantidade: "+item.getQuantidade());
        valor.setText("Valor: " + item.getValor());

        if(item.getValor() > 200)
            imageView.setImageResource(R.drawable.master_ball);
        if(item.getValor() > 400)
            imageView.setImageResource(R.drawable.ultra_ball);
        return nossoview;
    }
}
