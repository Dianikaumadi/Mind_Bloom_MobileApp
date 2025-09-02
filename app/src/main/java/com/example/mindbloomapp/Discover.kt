package com.example.mindbloomapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class Discover : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_discover)


        findViewById<MaterialButton>(R.id.btnBreathing).setOnClickListener {
            navigate<BreathingExercises>()
        }
        findViewById<MaterialButton>(R.id.btnJournals).setOnClickListener {
            navigate<Journals>()
        }
        findViewById<MaterialButton>(R.id.btnArts).setOnClickListener {
            navigate<SoothingArt>()
        }



        val navHome: LinearLayout = findViewById(R.id.navHome)
        val navSleep: LinearLayout = findViewById(R.id.navSleep)
        val navDiscover: LinearLayout = findViewById(R.id.navDiscover)
        val navProfile: LinearLayout = findViewById(R.id.navProfile)
        val navPremium: LinearLayout = findViewById(R.id.navPremium)

        navDiscover.isSelected = true

        navHome.setOnClickListener     { navigate<Home>() }
        navSleep.setOnClickListener    { navigate<Sleep>() }
        navDiscover.setOnClickListener {  }
        navProfile.setOnClickListener  { navigate<Profile>() }
        navPremium.setOnClickListener  { navigate<PremiumActivity>() }
    }

    private inline fun <reified T : Activity> navigate() {
        startActivity(Intent(this, T::class.java))
        finish()

    }
}
