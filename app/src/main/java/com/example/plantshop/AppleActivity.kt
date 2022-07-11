package com.example.plantshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AppleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apple)

        // Top bar
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Apple Braeburn"
    }
}