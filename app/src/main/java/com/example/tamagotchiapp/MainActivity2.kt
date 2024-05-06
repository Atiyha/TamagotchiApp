package com.example.tamagotchiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {

    private var pHunger = 50
    private var pClean = 50
    private var pHappy = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //Initializing components
        val btnFeed = findViewById<Button>(R.id.btnFeed)
        val btnClean = findViewById<Button>(R.id.btnClean)
        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val edtHunger = findViewById<EditText>(R.id.edtHunger)
        val edtClean = findViewById<EditText>(R.id.edtClean)
        val edtHappy = findViewById<EditText>(R.id.edtHappy)
        val imgView = findViewById<ImageView>(R.id.imgView)

        //set the initial text values
        edtHunger.setText(pHunger.toString())
        edtClean.setText(pClean.toString())
        edtHappy.setText(pHappy.toString())

        //handle for button clicks
        btnFeed.setOnClickListener {
            pHunger += 10
            pHappy += 10
            pClean += 5
            edtHunger.setText(pHunger.toString())
            imgView.setImageResource(R.drawable.eat_1)
        }

        btnClean.setOnClickListener {
            pClean += 10
            pHappy += 10
            edtClean.setText(pClean.toString())
            imgView.setImageResource(R.drawable.clean_1)
        }

        btnPlay.setOnClickListener {
            pHappy += 10
            pHunger += 5
            pClean += 5
            edtHappy.setText(pHappy.toString())
            imgView.setImageResource(R.drawable.play)
        }
    }
}