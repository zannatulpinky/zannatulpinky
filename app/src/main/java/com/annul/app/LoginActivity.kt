package com.annul.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.annul.app.R.id.editTextTextEmailAddress
import com.annul.app.R.id.editTextTextPassword

class LoginActivity : AppCompatActivity() {

    lateinit var viewModel: UserViewModel

    //val usersArray = arrayListOf<String>("pinky.h@yahoo.com","zannat.pink@gmail.com","riaz.u@gmail.com","r.h@gmail.com")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        viewModel = ViewModelProvider (this)[UserViewModel::class.java]

        val etMail = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val etPass = findViewById<EditText>(R.id.editTextTextPassword)
        val saveBtn = findViewById<Button>(R.id.button2)

        saveBtn.setOnClickListener {
            val email = etMail.text.toString()
            //viewModel.email = email
            val password = etPass.text.toString()

            //Authentication User
            /*var isAuth = false
            for (user in usersArray){
                if(email == user){
                    isAuth = true
                    break
                }
            }*/

            if(viewModel.isValidUser(User(email,password))) {
                Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, DataActivity::class.java).apply {

                    putExtra("EMAIL", email)
                    putExtra("PASSWORD", password)
                }

                startActivity(intent)
            }
            else{
                Toast.makeText(this, "Email is not valid", Toast.LENGTH_SHORT).show()
            }
        }
    }
}