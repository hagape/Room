package com.example.logonrm.room

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by logonrm on 20/03/2018.
 */
@Entity(tableName = "Nota" )
data class Nota (

    @PrimaryKey(autoGenerate = true)
    val id: Int?,

    @ColumnInfo(name ="Descricao")
    var descricao: String) {
    constructor() : this(null, "")





}