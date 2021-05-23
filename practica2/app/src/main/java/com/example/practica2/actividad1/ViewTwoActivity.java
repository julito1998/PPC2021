package com.example.practica2.actividad1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.practica2.R;

public class ViewTwoActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.practica2.actividad1.ViewTwoActivity.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

       Intent intent = getIntent();
        String message = intent.getStringExtra(ViewOneActivity.EXTRA_MESSAGE);
        EditText editText =(EditText)findViewById(R.id.txtTextoEnviado);
        editText.setText(message);

    }

    public void enviarTexto(View view){
        Intent intent = new Intent(ViewTwoActivity.this, ViewOneActivity.class);
        EditText texto = (EditText) findViewById(R.id.txtTextoEnviado);
        String mensaje = texto.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, mensaje);
        finish();
        startActivity(intent);
    }
    public void irAtras(View view){
        finish();
    }
}
