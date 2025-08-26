package com.example.mindbloomapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class Discover : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_discover)

        // Bottom nav from @layout/partial_bottom_nav (included as bottomBarInclude in XML)
        val navHome: LinearLayout = findViewById(R.id.navHome)
        val navSleep: LinearLayout = findViewById(R.id.navSleep)
        val navDiscover: LinearLayout = findViewById(R.id.navDiscover)
        val navProfile: LinearLayout = findViewById(R.id.navProfile)
        val navPremium: LinearLayout = findViewById(R.id.navPremium)

        // Mark current tab
        navDiscover.isSelected = true

        // Navigate tabs
        navHome.setOnClickListener      { navigate<Home>() }
        navSleep.setOnClickListener     { navigate<Sleep>() }
        navDiscover.setOnClickListener  { /* already here */ }
        navProfile.setOnClickListener   { navigate<Profile>() }
        navPremium.setOnClickListener   { navigate<PremiumActivity>() }
    }

    private inline fun <reified T : Activity> navigate() {
        startActivity(Intent(this, T::class.java))
        finish() // avoid stacking multiple activities while switching tabs
        // overridePendingTransition(0, 0) // uncomment to remove transition animation
    }
}
