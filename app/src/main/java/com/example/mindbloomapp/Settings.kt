package com.example.mindbloomapp

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.card.MaterialCardView

class Settings : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings) // uses your settings XML

        // Toolbar back
        findViewById<MaterialToolbar>(R.id.toolbar).setNavigationOnClickListener { finish() }

        // Rows -> navigate
        findViewById<MaterialCardView>(R.id.rowEditProfile).setOnClickListener {
            startActivity(Intent(this, EditProfile::class.java))
        }
        findViewById<MaterialCardView>(R.id.rowSubscription).setOnClickListener {
            startActivity(Intent(this, Plan::class.java))
        }

        // Bottom nav
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
