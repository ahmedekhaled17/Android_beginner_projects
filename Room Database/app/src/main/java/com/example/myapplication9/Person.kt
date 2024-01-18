package com.example.myapplication9

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Person")
data class Person (
    @PrimaryKey(autoGenerate = true)
    var id:Int ,
    var name:String
              )