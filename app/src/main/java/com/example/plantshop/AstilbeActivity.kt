package com.example.plantshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AstilbeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_astilbe)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Astilbe"
    }
}