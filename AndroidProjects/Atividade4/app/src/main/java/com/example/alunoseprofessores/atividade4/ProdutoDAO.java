package com.example.alunoseprofessores.atividade4;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface ProdutoDAO {
    @Query("SELECT * FROM Produto")
    List<Produto> getAll();

    @Query("SELECT * FROM Produto WHERE nome LIKE :nomeProcurado")
    Produto findByName(String nomeProcurado);

    @Insert
    void insert(Produto produto);

    @Delete
    void delete(Produto produto);
}
