package com.example.colorpicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Spinner
import android.widget.TextView


class MainActivity : AppCompatActivity() {

   private var spin:Spinner? =null
    private var txt:TextView? =null
    private var image:ImageView? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spin=findViewById<View>(R.id.action_bar_spinner) as Spinner
        txt=findViewById<View>(R.id.textview) as TextView
        image=findViewById<View>(R.id.image) as ImageView

    }
    fun onColor(View:View?){
        var s = spin?.selectedItem as String
        txt?.text = s
        if(s=="blue")image?.setImageResource(R.drawable.blue)
        else if(s=="green")image?.setImageResource(R.drawable.green)
        else if(s=="red")image?.setImageResource(R.drawable.red)
        else image?.setImageResource(R.drawable.white)
    }
}