package com.example.mindbloomapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainStart : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_start)

        findViewById<View>(R.id.btnStartfinal).setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
    }
}
