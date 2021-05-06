package com.example.ejemplo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

const val EXTRA_MESSAGE = "com.example.ejemplo.SubActivity.MESSAGE"

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val btnCancel : Button = findViewById(R.id.cancel_button)
        btnCancel.setOnClickListener{
            finish()
        }

        //obtengo el Button de la vista por el id en la variable btn
        val btnOk : Button = findViewById(R.id.ok_button)
        //le seteo el evento click al btn
        btnOk.setOnClickListener{
            //obtengo el texto del textBox por el id
            val editText = findViewById<EditText>(R.id.plain_text_input)
            //convierto el texto en string
            val message = editText.text.toString()
            //se lo paso al activity main, en el EXTRA_MESSAGE pongo la ruta de donde viene el message
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra(EXTRA_MESSAGE, message)
            }
            //ejecuto la otra activity
            startActivity(intent)
        }

    }
}