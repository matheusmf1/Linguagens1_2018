package com.example.alunoseprofessores.atividade4;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = { Usuario.class, Produto.class }, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UsuarioDAO getUsuarioDAO();
    public abstract ProdutoDAO getProdutoDAO();
}
