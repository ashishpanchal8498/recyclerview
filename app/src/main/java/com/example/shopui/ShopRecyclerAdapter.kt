package com.example.shopui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ShopRecyclerAdapter : RecyclerView.Adapter<ShopRecyclerAdapter.MyHolder>(){

    var rainimage :Array<Int> = arrayOf(R.drawable.rain1,R.drawable.rain2,R.drawable.rain3,R.drawable.rain4,R.drawable.rain5,
        R.drawable.rain6,R.drawable.rain7,R.drawable.rain8,R.drawable.rain9)
    var raintext :Array<String> = arrayOf("rain1","rain2","rain3","rain4","rain5","rain6","rain7","rain8","rain9")
    var raindescription :Array<String> = arrayOf("rain1","rain2","rain3","rain4","rain5","rain6","rain7","rain8","rain9")

    inner class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var rainimage : ImageView
        var raintext : TextView
        var raindescription : TextView
        init {
            rainimage = itemView.findViewById(R.id.imageView)
            raintext = itemView.findViewById(R.id.textviewrain)
            raindescription = itemView.findViewById(R.id.textviewraindetail)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.cardlayout,parent,false)
        return MyHolder(v)
    }

    override fun getItemCount(): Int {
        return raintext.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.rainimage.setImageResource(rainimage[position])
        holder.raintext.text = raintext[position]
        holder.raindescription.text = raindescription[position]
    }
}


