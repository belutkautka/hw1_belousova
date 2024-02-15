package com.application.hw1

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SquareActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square)

        val count = intent.getIntExtra(MainActivity.BUNDLE_KEY, 1)

        val squareTextView = findViewById<TextView>(R.id.squareTextView)

        squareTextView.text = (count * count).toString()
    }

    override fun onStart() {
        Log.d("SquareActivity", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("SquareActivity", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("SquareActivity", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("SquareActivity", "onStop")

        super.onStop()
    }

    override fun onDestroy() {
        Log.d("MainActivity", "onDestroySquare")

        MainActivity.count++
        super.onDestroy()
    }
}