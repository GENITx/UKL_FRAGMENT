package com.example.ukl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var email: EditText
    private lateinit var sandi: EditText
    private lateinit var btnLoginActivity: Button
    private lateinit var btnRegisActivity: Button
    private val KEY_EMAIL = "EA"
    private val KEY_PASS = "PP"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email = findViewById(R.id.txtUser)
        sandi = findViewById(R.id.txtPassword)

        btnLoginActivity = findViewById(R.id.login)
        btnRegisActivity = findViewById(R.id.regis)

        btnLoginActivity.setOnClickListener {
            try {
                val username = email.text.toString()
                val sandi = sandi.text.toString()
                if (username.isNotBlank() && sandi.isNotBlank()) {
                        val moveIntent = Intent(this@MainActivity, Home::class.java)
                        moveIntent.putExtra(KEY_EMAIL, username)
                        moveIntent.putExtra(KEY_PASS, sandi)
                        startActivity(moveIntent)
                    } else {
                        Toast.makeText(
                            applicationContext,
                            "PLEASE PUT YOUR EMAIL & PASS",
                            Toast.LENGTH_SHORT).show()
                }
            } catch (e: Exception) {
                Toast.makeText(
                    applicationContext,
                    "ERROR, PLEASE TRY AGAIN!",
                    Toast.LENGTH_SHORT).show()
            }
        }

        btnRegisActivity.setOnClickListener{
            try {
                val moveIntent = Intent(this@MainActivity, RegisActivity::class.java)
                startActivity(moveIntent)
            } catch (e: Exception) {
                Toast.makeText(
                    applicationContext,
                    "ERROR, PLEASE TRY AGAIN!",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}