package com.example.ejemplo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.lang.String



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn : Button = findViewById<Button>(R.id.button1)

        val message = intent.getStringExtra(EXTRA_MESSAGE)

        val textView = findViewById<TextView>(R.id.texto1).apply {
            text = message
        }

        // Register the onClick listener with the implementation above
        btn.setOnClickListener {
            var intent = Intent(this, SubActivity::class.java)
                startActivity(intent)
        }
    }
}

