package com.example.ukl

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Home : AppCompatActivity() {
    private lateinit var txtEmail: TextView
    private lateinit var txtPass: TextView
    private var email: String? = null
    private var pass: String? = null
    private val KEY_EMAIL = "EA"
    private val KEY_PASS = "PP"

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        txtEmail = findViewById(R.id.tampilEmail)
        txtPass = findViewById(R.id.tampilPass)

        val extras = intent.extras
        email = extras?.getString(KEY_EMAIL)
        pass = extras?.getString(KEY_PASS)
        txtEmail.text = "Email = $email"
        txtPass.text = "Password = $pass"

    }
}