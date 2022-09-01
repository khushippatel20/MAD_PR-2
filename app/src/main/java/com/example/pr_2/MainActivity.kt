package com.example.pr_2

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       Toast.makeText(applicationContext, "No resume function called", Toast.LENGTH_LONG).show()
        Toast.makeText(applicationContext, "function called", Toast.LENGTH_LONG).show()

    }
}