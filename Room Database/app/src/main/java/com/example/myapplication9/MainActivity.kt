package com.example.myapplication9

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv = findViewById<TextView>(R.id.tv_test)

        var db = MyDb.getRoomObject(this)

        var myfun = db.getMyFun()

        var p = Person(0,"ali")


        myfun.myInsert(p)

       var r = myfun.getAllPerson()
        tv.text = r.get(0).toString()
    }
}