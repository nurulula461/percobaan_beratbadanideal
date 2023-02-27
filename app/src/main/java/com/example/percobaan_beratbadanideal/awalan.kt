package com.example.percobaan_beratbadanideal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class awalan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_awalan)
    }
    fun berban (view: View){
        val pindah = Intent(this, MainActivity::class.java)
        startActivity(pindah)

    }
}