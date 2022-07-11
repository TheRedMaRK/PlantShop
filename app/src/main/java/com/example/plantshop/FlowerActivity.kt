package com.example.plantshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FlowerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flower)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Paeonia Lactiflora"

        findViewById<Button>(R.id.rbtn2).setOnClickListener {
            val intent = Intent(this,PaeoniaLactifloraActivity::class.java)
            startActivity(intent)
        }
    }
}