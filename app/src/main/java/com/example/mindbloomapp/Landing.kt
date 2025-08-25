package com.example.mindbloomapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Landing : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_landing)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnlog = findViewById<Button>(R.id.btnlogin_land)
        btnlog.setOnClickListener {
            // Navigate to Onboard2 (replace with your actual target activity)
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        }

        val btnsign = findViewById<Button>(R.id.butsign_land)
        btnsign.setOnClickListener {
            // Navigate to Onboard2 (replace with your actual target activity)
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
            finish()
        }


    }
}