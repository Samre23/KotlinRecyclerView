package com.example.listviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flowerList = DataSource(this).getFlowerList()

        Log.e("MainActivity ==> ",flowerList.size.toString())

        val recycerlView : RecyclerView = findViewById(R.id.recyclerView)
        recycerlView.adapter = FlowerAdapter(flowerList)

    }
}