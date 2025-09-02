package com.example.mindbloomapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar

class coloring : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coloring)


        findViewById<MaterialToolbar>(R.id.toolbar).setNavigationOnClickListener { finish() }
    }
}
