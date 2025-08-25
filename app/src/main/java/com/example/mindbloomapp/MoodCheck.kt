package com.example.mindbloomapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MoodCheck : AppCompatActivity() {

    companion object {
        const val EXTRA_MOOD = "extra_mood"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mood_check)

        // Set up listeners for each mood option
        findViewById<View>(R.id.moodHappy).setOnClickListener   { navigateToMainStart("Happy") }
        findViewById<View>(R.id.moodLoved).setOnClickListener   { navigateToMainStart("Loved") }
        findViewById<View>(R.id.moodSad).setOnClickListener     { navigateToMainStart("Sad") }
        findViewById<View>(R.id.moodAngry).setOnClickListener   { navigateToMainStart("Angry") }
        findViewById<View>(R.id.moodTired).setOnClickListener   { navigateToMainStart("Tired") }
        findViewById<View>(R.id.moodStressed).setOnClickListener{ navigateToMainStart("Stressed") }
    }

    private fun navigateToMainStart(mood: String) {
        val intent = Intent(this, MainStart::class.java).apply {
            putExtra(EXTRA_MOOD, mood)
        }
        startActivity(intent)
    }
}
