package com.example.myapplication9

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Person::class], version = 1)
abstract class MyDb : RoomDatabase() {
    abstract fun getMyFun() : MyDao

    companion object{

       @Volatile var instance:MyDb? = null

       @Synchronized fun getRoomObject(con : Context):MyDb{

            if (instance == null) {

                var db = Room
                    .databaseBuilder(con, MyDb::class.java, "app1Db")
                    .allowMainThreadQueries()
                    .build()

                instance = db
                return instance!!
            }
            else{
                return instance!!
            }

        }
    }
}