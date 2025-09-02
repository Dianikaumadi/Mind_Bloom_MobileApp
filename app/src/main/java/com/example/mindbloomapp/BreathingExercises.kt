package com.example.mindbloomapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar

class BreathingExercises : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breathing_exercises)



        findViewById<MaterialToolbar>(R.id.toolbar).setNavigationOnClickListener {
            startActivity(Intent(this, Discover::class.java))
            finish()
        }

    }
}
