package com.example.mindbloomapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MoodCheck : AppCompatActivity() {

    companion object { const val EXTRA_MOOD = "extra_mood" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mood_check)

        setClick(R.id.moodHappy,    "Happy")
        setClick(R.id.moodLoved,    "Loved")
        setClick(R.id.moodSad,      "Sad")
        setClick(R.id.moodAngry,    "Angry")
        setClick(R.id.moodTired,    "Tired")
        setClick(R.id.moodStressed, "Stressed")
    }

    private fun setClick(viewId: Int, mood: String) {
        findViewById<View>(viewId).setOnClickListener {
            val i = Intent(this, MainStart::class.java).apply {
                putExtra(EXTRA_MOOD, mood)
            }
            startActivity(i)
        }
    }
}
