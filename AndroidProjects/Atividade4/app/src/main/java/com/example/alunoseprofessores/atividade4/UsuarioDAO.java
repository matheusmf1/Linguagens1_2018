package com.example.alunoseprofessores.atividade4;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface UsuarioDAO {
    @Query("SELECT * FROM Usuario")
    List<Usuario> getAll();

    @Query("SELECT * FROM Usuario WHERE login LIKE :loginProcurado")
    Usuario findByLogin(String loginProcurado);

    @Insert
    void insert(Usuario usuario);

    @Delete
    void delete(Usuario usuario);
}
