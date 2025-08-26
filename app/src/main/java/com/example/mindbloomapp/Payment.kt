package com.example.mindbloomapp

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.button.MaterialButton

class Payment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)


        findViewById<MaterialToolbar>(R.id.toolbar).setNavigationOnClickListener {
            startActivity(Intent(this, Plan::class.java))

        }

        findViewById<MaterialButton>(R.id.btnPurchase).setOnClickListener {
            startActivity(Intent(this, PaymentSuccess::class.java))
        }




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
