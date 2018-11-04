package com.example.murilo.primeirotesteroom;

import androidx.room.Database;
import androidx.room.RoomDatabase;
//AJUNTA TUDO PARA COLOCAR NO BANCO
//SE REFATORAR O BANCO OU CRIAR OUTRA TABELA, mudar a version

@Database(entities = {Usuario.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UsuarioDAO usuarioDAO();
}
