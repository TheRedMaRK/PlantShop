package com.example.plantshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PlantActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Plants"

        findViewById<Button>(R.id.btnplant1).setOnClickListener {
            val intent = Intent(this, AstilbeActivity::class.java)
            startActivity(intent)
        }
    }
}