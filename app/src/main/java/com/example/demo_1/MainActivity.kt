package com.example.demo_1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

//import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greetingTextView = findViewById<TextView>(R.id.txt_1)
        val editingTextView = findViewById<EditText>(R.id.edit_txt)
        val actionButtonView = findViewById<Button>(R.id.submit_button)
        val viewOfferButton = findViewById<Button>(R.id.id_offer)
        var textIs = ""
        actionButtonView.setOnClickListener {

            if (editingTextView.text.toString().isNotEmpty()) {
                textIs = editingTextView.text.toString()
                greetingTextView.text = "Welcome ${editingTextView.text.toString()}"
                editingTextView.text.clear()
                viewOfferButton.setVisibility(View.VISIBLE);
            } else {
                viewOfferButton.setVisibility(View.GONE);
                Toast.makeText(this@MainActivity, "Please enter your name", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        viewOfferButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("keyUser" ,textIs )
            startActivity(intent)
        }
    }
}