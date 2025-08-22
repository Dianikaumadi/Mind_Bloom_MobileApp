package com.example.mindbloomapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val videoView = findViewById<VideoView>(R.id.videoView)

        val uri = Uri.parse("android.resource://$packageName/${R.raw.splash}")
        videoView.setVideoURI(uri)

        videoView.setOnPreparedListener { mp ->
            mp.isLooping = false
            videoView.start()
        }

        // After the video completes, wait 2s and go to Onboard1
        videoView.setOnCompletionListener {
            Handler(Looper.getMainLooper()).postDelayed({
                startActivity(Intent(this, onboard_1::class.java))
                finish()
            }, 2000)
        }
    }
}
