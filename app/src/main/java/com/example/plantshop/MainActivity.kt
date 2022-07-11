package com.example.plantshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

// main class
class MainActivity : AppCompatActivity() {

    // main function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // find the button and assign it to a variable
        /*

        var fruitsButton = findViewById<Button>(R.id.btnFruits)

        fruitsButton.setOnClickListener {

        }

         */

        // find the button and write its onclick function
        findViewById<Button>(R.id.btnFruits).setOnClickListener {
            val intent = Intent(this, FruitActivity::class.java)
            startActivity(intent)
        }
    }

}