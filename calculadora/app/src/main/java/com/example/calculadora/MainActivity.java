package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Double.parseDouble;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextA = findViewById(R.id.txtOperandoA);
        //convierto el texto en string
        String operandoA = editTextA.toString();

        EditText editTextB = findViewById(R.id.txtOperandoB);
        String operandoB = editTextB.toString();

        TextView resultado = findViewById(R.id.txtResultado);

        Button btnSumar = findViewById(R.id.btnSumar);
        btnSumar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence resultadoCharSequence = String.valueOf(parseDouble(operandoA) + parseDouble(operandoB));
                resultado.setText(resultadoCharSequence);
            }
        });

        Button btnRestar = findViewById(R.id.btnRestar);
        btnRestar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence resultadoCharSequence =String.valueOf(parseDouble(operandoA) - parseDouble(operandoB));
                resultado.setText(resultadoCharSequence);
            }
        });

        Button btnDividir = findViewById(R.id.btnDividir);
        btnDividir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence resultadoCharSequence =String.valueOf(parseDouble(operandoA) / parseDouble(operandoB));
                resultado.setText(resultadoCharSequence);
            }
        });
        Button btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence resultadoCharSequence =String.valueOf(parseDouble(operandoA) * parseDouble(operandoB));
                resultado.setText(resultadoCharSequence);
            }
        });
    }
}