package com.example.tip_calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.TextView
import com.example.tip_calculator.R
import kotlin.math.ceil
class MainActivity : AppCompatActivity() {
    private var editText : EditText? = null
    private var radioGroup : RadioGroup? = null
    private var switch : Switch? = null
    private var txtResult : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById<View>(R.id.edit) as EditText
        radioGroup = findViewById<View>(R.id.rg) as RadioGroup
        switch = findViewById<View>(R.id.switchr) as Switch
        txtResult = findViewById<View>(R.id.result) as TextView
    }
    @SuppressLint("SuspiciousIndentation")
    fun tipCalculate(view: View?){
        var sCost = editText?.text.toString()
        var cost = sCost.toDouble()
        val percent = radioGroup?.checkedRadioButtonId
        var tip :Double  = when
        {
            percent == R.id.amazing -> .2*cost
            percent == R.id.goodr -> .18*cost
            percent == R.id.okr -> .15*cost
            else -> 0.0

        }
        if (switch ?.isChecked == true)
            tip = ceil(tip)

        txtResult?.text = "result is $tip"
    }
}