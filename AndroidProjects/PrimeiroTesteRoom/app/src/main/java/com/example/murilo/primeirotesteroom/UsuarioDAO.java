package com.example.murilo.primeirotesteroom;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

//Classe DAO da ROOM
@Dao
public interface UsuarioDAO {
//    TODA VEZ QUE HOUVER UMA BUSCA, HA UMA QUERY
    @Query("SELECT * FROM Usuario")
    List<Usuario> getAll();

//    Para acessar a lista de users (:nomeLista), () caracteriza uma tupla
    @Query("SELECT * FROM Usuario WHERE uid IN (:userIds)")
    List<Usuario> loadAllByIds(int[] userIds);

//  para buscar esse cara no banco usar :nome
    @Query("SELECT * FROM Usuario WHERE nome LIKE :nomeProcura  ")
    Usuario findByName(String nomeProcura);

    @Insert
    void insertAll(Usuario... users);

    @Insert
    void insert(Usuario usuario);

    @Delete
    void delete(Usuario user);
}