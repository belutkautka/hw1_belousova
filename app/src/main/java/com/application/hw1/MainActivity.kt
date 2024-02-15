package com.application.hw1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "onCreate")

        val counterTextView = findViewById<TextView>(R.id.mainTextView)
        val goToSquareButton = findViewById<Button>(R.id.goToSquareButton)

        counterTextView.text = count.toString()
        goToSquareButton.setOnClickListener {
            val intent = Intent(this, SquareActivity::class.java).apply {
                putExtra(BUNDLE_KEY, count)
            }
            startActivity(intent)
        }
    }

    override fun onStart() {
        Log.d("MainActivity", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("MainActivity", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("MainActivity", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("MainActivity", "onStop")

        super.onStop()
    }

    override fun onDestroy() {
        Log.d("MainActivity", "onDestroy")

        count++
        super.onDestroy()
    }

    companion object {
        val BUNDLE_KEY = "SQUARE_KEY"

        var count = 0
    }
}