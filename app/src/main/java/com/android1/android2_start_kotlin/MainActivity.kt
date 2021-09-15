package com.android1.android2_start_kotlin

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        savedInstanceState?.deepCopy()
        savedInstanceState ?: println()
        if (savedInstanceState == null) println("null") else println("not null")

        val data = Person("Nikita", "Her name")
        Toast.makeText(this, "Name: ${data.firstName}, ${data.secondName}", Toast.LENGTH_SHORT).show()
    }
}