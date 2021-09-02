package ru.kravchenko.listviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val array = arrayOf("1", "2", "3", "4", "5", "5", "6",
//            "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20")

//        val list_view: ListView = findViewById(R.id.list_view)
//        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array)
//        list_view.adapter = adapter

        val arrayList : ArrayList<Data> = ArrayList()
        val list_view : ListView = findViewById(R.id.list_view)

        arrayList.add(Data("0", "audio_0"))
        arrayList.add(Data("1", "audio_1"))
        arrayList.add(Data("2", "audio_2"))
        arrayList.add(Data("3", "audio_3"))
        arrayList.add(Data("4", "audio_4"))
        arrayList.add(Data("5", "audio_5"))
        arrayList.add(Data("6", "audio_6"))
        arrayList.add(Data("7", "audio_7"))
        arrayList.add(Data("8", "audio_8"))
        arrayList.add(Data("9", "audio_9"))
        arrayList.add(Data("10", "audio_10"))

        val customAdaptor : CustomAdaptor = CustomAdaptor(arrayList)
        list_view.adapter = customAdaptor
    }
}