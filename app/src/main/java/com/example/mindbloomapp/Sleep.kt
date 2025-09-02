package com.example.mindbloomapp

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class Sleep : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sleep)

        findViewById<LinearLayout>(R.id.navHome).setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
        findViewById<LinearLayout>(R.id.navSleep).setOnClickListener {
            startActivity(Intent(this, Sleep::class.java))
        }
        findViewById<LinearLayout>(R.id.navDiscover).setOnClickListener {
            startActivity(Intent(this, Discover::class.java))
        }
        findViewById<LinearLayout>(R.id.navProfile).setOnClickListener {
            startActivity(Intent(this, Profile::class.java))
        }
        findViewById<LinearLayout>(R.id.navPremium).setOnClickListener {
            startActivity(Intent(this, PremiumActivity::class.java))
        }
    }
}
