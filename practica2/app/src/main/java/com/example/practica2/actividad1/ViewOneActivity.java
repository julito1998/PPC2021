package com.example.practica2.actividad1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.practica2.R;

public class ViewOneActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.practica2.actividad1.ViewOneActivity.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        Intent intent = getIntent();

        String message = intent.getStringExtra(ViewTwoActivity.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.txtTextoRecibido);
        textView.setText(message);

        Button btn = findViewById(R.id.btnIniciarSubActividad);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewOneActivity.this, ViewTwoActivity.class);
                TextView texto = (TextView) findViewById(R.id.txtTextoRecibido);
                String mensaje = texto.getText().toString();
                if (mensaje.trim() != ""){
                    intent.putExtra(EXTRA_MESSAGE, mensaje);
                }
                finish();
                startActivity(intent);
            }
        });
    }



}
