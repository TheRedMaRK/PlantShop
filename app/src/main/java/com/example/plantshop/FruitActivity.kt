package com.example.plantshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FruitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit)

        // Top bar
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Fruits"

        findViewById<Button>(R.id.btnApple).setOnClickListener {
            val intent = Intent(this, AppleActivity::class.java)
            startActivity(intent)
        }
    }
}