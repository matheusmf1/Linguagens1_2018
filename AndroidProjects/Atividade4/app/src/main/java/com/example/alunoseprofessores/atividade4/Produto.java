package com.example.alunoseprofessores.atividade4;

import java.io.Serializable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Produto implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private int uid;
    @ColumnInfo(name = "nome")
    private String nome;
    @ColumnInfo(name = "valor")
    private Double valor;
    @ColumnInfo(name = "tipo")
    private String tipo;

    public Produto(String nome, Double valor, String tipo) {
        setNome(nome);
        setValor(valor);
        setTipo(tipo);
    }

    public Produto() {
        setNome("");
        setValor(0.0);
        setTipo("");
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @NonNull
    @Override
    public String toString() { return getNome() + "\t" + getValor() + "\t" + getTipo(); }
}
