package com.example.alunoseprofessores.atividade4;

import java.io.Serializable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Usuario implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private int uid;
    @ColumnInfo(name = "login")
    private String login;
    @ColumnInfo(name = "nome")
    private String nome;
    @ColumnInfo(name = "senha")
    private String senha;

    public Usuario(String nome, String login, String senha) {
        setNome(nome);
        setLogin(login);
        setSenha(senha);
    }

    public Usuario() {
        setNome("");
        setLogin("");
        setSenha("");
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
