package br.maua.matheus.retomada_listview;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface ItemParaMostrarDAO {

    @Query("SELECT * FROM ItemParaMostrar")
    List<ItemParaMostrar> getAll();

    @Query("SELECT * FROM ItemParaMostrar WHERE nome LIKE :nome")
    ItemParaMostrar get(String nome);

    @Insert
    void inserirItem(ItemParaMostrar item);

    @Update
    void atualizarItem(ItemParaMostrar item);

    @Delete
    void deletarItem(ItemParaMostrar item);


}
