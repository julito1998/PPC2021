package com.example.practica2.actividad2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.practica2.R;

public class CalculadoraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        //una forma de setear eventos a controladores de la vista
        Button btnSumar = findViewById(R.id.btnSumar);
        btnSumar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ObtenerValores();
                resultadoOperando=operandoA+operandoB;
                resultado.setText(String.valueOf(resultadoOperando));
            }
        });

        Button btnRestar = findViewById(R.id.btnRestar);
        btnRestar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ObtenerValores();
                resultadoOperando=operandoA-operandoB;
                resultado.setText(String.valueOf(resultadoOperando));
            }
        });

    }

    //ejercicio 2
    private TextView resultado;
    private Double operandoA, operandoB,resultadoOperando;

    public void ObtenerValores() {
        //obtengo los valores de los txt ingresados por el usuario
        EditText editTextA = (EditText) findViewById(R.id.txtOperandoA);
        EditText editTextB = (EditText) findViewById(R.id.txtOperandoB);

        //convierto el texto en doubles
        operandoA = Double.parseDouble(editTextA.getText().toString());
        operandoB = Double.parseDouble(editTextB.getText().toString());
        //capturo en resultado el txtResultado
        resultado = (TextView) findViewById(R.id.txtResultado);

    }

    //otra forma de setear eventos a controladores de la vista, se debe indicar el metodo en el activity

    public void multiplicar(View v){
        ObtenerValores();
        resultadoOperando=operandoA*operandoB;
        resultado.setText(String.valueOf(resultadoOperando));
    }

    public void dividir(View v){
        ObtenerValores();
        if (operandoB != 0 ){
             resultadoOperando=operandoA/operandoB;
        }
        resultado.setText(String.valueOf(resultadoOperando));
    }
}
