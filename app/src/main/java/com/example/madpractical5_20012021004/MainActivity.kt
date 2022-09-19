package com.example.madpractical5_20012021004

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //By using explicit intent we used this start and stop service by calling MyService Class

    fun play(){
        Intent(applicationContext,MyService::class.java)
            .putExtra(MyService.DATA_KEY,MyService.DATA_VALUE)
            .apply { startService(this) }
    }
    fun stop(){
        Intent(applicationContext,MyService::class.java)
            .apply { stopService(this) }
    }
}