package com.example.fitnessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chestBtn = findViewById<Button>(R.id.chestBtn);
        val backBtn = findViewById<Button>(R.id.backBtn);
        val bicepsBtn = findViewById<Button>(R.id.bicepsBtn);
        val legsBtn = findViewById<Button>(R.id.legsBtn);



        chestBtn.setOnClickListener(){
            intent = Intent(this, ChestActivity::class.java)
            startActivity(intent)
        }

        backBtn.setOnClickListener(){
            intent = Intent(this, BackActivity::class.java)
            startActivity(intent)
        }

        bicepsBtn.setOnClickListener(){
            intent = Intent(this, BicepsActivity::class.java)
            startActivity(intent)
        }

        legsBtn.setOnClickListener(){
            intent = Intent(this, LegsActivity::class.java)
            startActivity(intent)
        }
    }



}