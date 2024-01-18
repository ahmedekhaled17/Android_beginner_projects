package com.example.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rec)
        val nameMeals =  arrayOf("meat","berger","v","meat","sand","meat")
        val priceMeals =  arrayOf("200$","150$","100$","200$","150$","200$")
        val imageMeals =  arrayOf(R.drawable.meat,R.drawable.berger,R.drawable.v,R.drawable.meat,R.drawable.snad,R.drawable.meat)


        recyclerView.adapter =CustomAdapter(imageMeals,nameMeals,priceMeals)



    }
}