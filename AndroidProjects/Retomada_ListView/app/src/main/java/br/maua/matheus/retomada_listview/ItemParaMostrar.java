package br.maua.matheus.retomada_listview;

import java.io.Serializable;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class ItemParaMostrar implements Serializable {

    @PrimaryKey (autoGenerate = true)
    private int uid;

    @ColumnInfo (name = "nome")
    private String nome;

    @ColumnInfo (name = "valor")
    private Double valor;

    @ColumnInfo (name = "quantidade")
    private int quantidade;


    public ItemParaMostrar(){
        setNome("");
        setQuantidade(0);
        setValor(0.0);
    }

    public ItemParaMostrar(String nome, int quantidade, Double valor){
        setNome(nome);
        setQuantidade(quantidade);
        setValor(valor);
    }

    @Override
    public String toString(){
        return getNome() + " " + getQuantidade() + " " + getValor();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
