package br.maua.matheus.retomada_listview;

import androidx.room.Database;
import androidx.room.RoomDatabase;


//ENTIDADES SAO AS TABELAS DO BANCO

@Database(entities = {ItemParaMostrar.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ItemParaMostrarDAO getDao();

}
