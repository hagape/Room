package com.example.logonrm.room

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*

/**
 * Created by logonrm on 20/03/2018.
 */
@Dao

        interface  NotaDao{
    @Insert
    fun criar(nota: Nota)

    @Update
    fun atualizar (nota: Nota)

    @Delete
    fun apagar (nota: Nota)

    @Query("SELECT * FROM Nota")
    fun buscarTodos(): LiveData<List<Nota>>
}
