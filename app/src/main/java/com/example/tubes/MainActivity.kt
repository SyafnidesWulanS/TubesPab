package com.example.userinteraction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity(){
    var pilihan:String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun tampilToast(pesan:String){
        Toast.makeText(applicationContext,pesan, Toast.LENGTH_SHORT).show();
    }
    fun fButton(tombol:View){
        pilihan = tombol.tag.toString()
        tampilToast("${pilihan} terpilih")
    }
    }