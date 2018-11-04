package com.example.murilo.primeirotesteroom;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

////Classe como base para o ROOM de persistência
//ELEMENTO QUE VAI ESTAR DENTRO DO BANCO

@Entity
public class Usuario {
    @PrimaryKey (autoGenerate = true)
    private int uid;

    @ColumnInfo(name = "nome")
    private String nome;

    @ColumnInfo(name = "telefone")
    private String telefone;

    @ColumnInfo(name = "email")
    private String email;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @NonNull
    @Override
    public String toString() {
        return getNome() + "\t" + getEmail() + "\t" +getTelefone();
    }
}
