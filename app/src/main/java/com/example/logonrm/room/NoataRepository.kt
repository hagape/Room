package com.example.logonrm.room

import android.app.Application
import android.arch.lifecycle.LiveData
import android.os.AsyncTask

/**
 * Created by logonrm on 20/03/2018.
 */
class NotaRepository(application: Application) {

    val notaDao: NotaDao?
    val notas : LiveData<List<Nota>>

    init {
        notaDao = NotaRoomDatabase
                .getDatabase(application)
                ?.notaDAO()

        notas = notaDao!!.buscarTodos()
    }

    fun criar(nota: Nota){
        insertAsyncTask(notaDao)
                .execute()
    }

    private class insertAsyncTask(private val mAsyncTaskDao: NotaDao?)
        : AsyncTask<Nota, Void, Void>() {

        override fun doInBackground(vararg params: Nota): Void? {
            mAsyncTaskDao?.criar(params[0])
            return null
        }
    }
}