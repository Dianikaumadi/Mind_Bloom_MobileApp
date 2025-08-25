package com.example.mindbloomapp

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.slider.Slider

class Themes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Use your XML file name here:
        setContentView(R.layout.activity_themes)

        // Up/back navigation
        findViewById<MaterialToolbar>(R.id.toolbar).setNavigationOnClickListener { finish() }

        // Configure the slider in code (since XML attrs were removed)
//        val slider = findViewById<Slider>(R.id.volumeSlider).apply {
//            valueFrom = 0f
//            valueTo = 100f
//            stepSize = 1f
//            value = 60f
//        }

        // Mute / Loud quick actions
        //findViewById<ImageButton>(R.id.btnMute).setOnClickListener { slider.value = 0f }
       // findViewById<ImageButton>(R.id.btnLoud).setOnClickListener { slider.value = 100f }
    }
}
