package com.example.listviewkotlin

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FlowerAdapter(val flowerList: Array<String>) :
    RecyclerView.Adapter<FlowerAdapter.FlowerViewHolder>() {



    class FlowerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val flowerTextView:TextView = itemView.findViewById(R.id.txt)
        fun bind(word:String){
            Log.e("onBindViewHolder ==> ","")
            flowerTextView.text = word
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return FlowerViewHolder(view)
    }

    override fun getItemCount(): Int {
        Log.e("getItemCount ==> ",flowerList.size.toString())
        return  flowerList.size
    }

    override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {
        Log.e("onBindViewHolder ==> ",flowerList.size.toString())
        holder.bind(flowerList[position])
    }

}