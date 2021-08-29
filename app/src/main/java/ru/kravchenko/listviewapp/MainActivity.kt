package ru.kravchenko.listviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val array = arrayOf("1", "2", "3", "4", "5", "5", "6",
            "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20")

        val list_view: ListView = findViewById(R.id.list_view)
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array)
        list_view.adapter = adapter

    }
}