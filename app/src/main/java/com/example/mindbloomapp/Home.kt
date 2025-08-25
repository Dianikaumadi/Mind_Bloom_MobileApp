package com.example.mindbloomapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // --- Bottom Nav hooks ---
        val navHome: LinearLayout = findViewById(R.id.navHome)
        val navSleep: LinearLayout = findViewById(R.id.navSleep)
        val navDiscover: LinearLayout = findViewById(R.id.navDiscover)
        val navProfile: LinearLayout = findViewById(R.id.navProfile)
        val navPremium: LinearLayout = findViewById(R.id.navPremium)

        // Mark Home as selected (visual state picked up by duplicateParentState in XML)
        navHome.isSelected = true

        // Home -> stay here
        navHome.setOnClickListener {
            // already on Home; no-op (you could scroll-to-top here if needed)
        }

        // Sleep
        navSleep.setOnClickListener {
            navigateSafely<Sleep>()
        }

        // Discover
        navDiscover.setOnClickListener {
            navigateSafely<Discover>()
        }

        // Profile
        navProfile.setOnClickListener {
            navigateSafely<Profile>()
        }

        // Premium
        navPremium.setOnClickListener {
          //  navigateSafely<Premium>()
        }
    }

    /**
     * Generic helper to start an Activity and finish the current one,
     * with a safety catch so it won't crash if the target isn't found yet.
     * Update the generic types above if your Activity names differ.
     */
    private inline fun <reified T : Activity> navigateSafely() {
        try {
            startActivity(Intent(this, T::class.java))
            // Prevent piling up activities when switching tabs:
            finish()
            // Optional: disable transition if you want a snappier tab feel
            // overridePendingTransition(0, 0)
        } catch (e: Exception) {
            Toast.makeText(
                this,
                "Screen not found. Please check the Activity name for ${T::class.java.simpleName}.",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
