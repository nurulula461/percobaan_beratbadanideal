package com.example.percobaan_beratbadanideal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash_Scren : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_scren)
        supportActionBar?.hide()

        Handler().postDelayed({
            startActivity(Intent(this, awalan::class.java))
            finish()
        }, 3000)
    }
}