package com.example.demo_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("MyTag" , "Activity On create")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        var textis = intent.getStringExtra("keyUser")
        var message = "$textis, You will get access for 1 month"
        val textView1: TextView = findViewById<TextView>(R.id.tvOffer) as TextView
        textView1.text = message
        Log.i("MyTag" , "message has been showed")
//    textOffer.text = message
    }
}