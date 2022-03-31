package com.annul.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        val btnData = findViewById<Button>(R.id.button3)
        val dText = findViewById<TextView>(R.id.dText)

        btnData.setOnClickListener {
            intent = Intent(this,MainActivity::class.java)

            startActivity(intent)
        }

        val email =  intent.getStringExtra("EMAIL")
        val password = intent.getStringExtra("PASSWORD")

        if (!email.isNullOrEmpty()){
            dText.text = "Email:$email"
        }
    }
}