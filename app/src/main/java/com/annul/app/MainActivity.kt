package com.annul.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.time.Instant

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginBtn = findViewById<Button>(R.id.button)
        val firstText = findViewById<TextView>(R.id.textView2)

        loginBtn.setOnClickListener {
            val intent = Intent (this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}