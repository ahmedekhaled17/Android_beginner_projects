package com.example.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(imageMeal:Array<Int>,nameMeal:Array<String>,priceMeal:Array<String>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    val myImageMeal = imageMeal
    val myNameMeal = nameMeal
    val myPriceMeal = priceMeal

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row,parent,false)
        return ViewHolder(view)
    }

    class ViewHolder (ItemView: View) : RecyclerView.ViewHolder(ItemView){

        val imageRow : ImageView = itemView.findViewById(R.id.imageView)
        val txt_name : TextView = itemView.findViewById(R.id.txtName)
        val txt_price : TextView = itemView.findViewById(R.id.txtPrice)

    }



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageRow.setImageResource(myImageMeal[position])
        holder.txt_name.text=myNameMeal[position].toString()
        holder.txt_price.text=myPriceMeal[position].toString()
    }

    override fun getItemCount(): Int {
        return 6
    }
}