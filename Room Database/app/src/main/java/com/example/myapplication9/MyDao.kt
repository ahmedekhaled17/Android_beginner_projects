package com.example.myapplication9

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface MyDao {
    @Insert
    fun myInsert(p:Person)

    @Query("select * from person")
    fun getAllPerson():MutableList<Person>
}