package com.example.practica2.actividad3;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.practica2.R;

public class DimensionesDePantallaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dimensiones);
    }

    //ejercicio 3
    public void obtenerDimensionesEnDP(View v){
        int width = this.getResources().getConfiguration().screenWidthDp;
        int height = this.getResources().getConfiguration().screenHeightDp;

        String dimensiones = "El Ancho de la pantalla en DP es: " + String.valueOf(width) + " y el Alto en DP es: " + String.valueOf(height);

        TextView TxtDimensiones = (TextView) findViewById(R.id.txtDimension);
        TxtDimensiones.setText(dimensiones);
    }

    public void obtenerDimensionesEnPixel(View v){
        int width = getResources().getDisplayMetrics().widthPixels;
        int height = getResources().getDisplayMetrics().heightPixels;
        String dimensiones = "El Ancho de la pantalla en Pixel es: " + String.valueOf(width) + " y el Alto en Pixel es: " + String.valueOf(height);

        TextView TxtDimensiones = (TextView) findViewById(R.id.txtDimension);
        TxtDimensiones.setText(dimensiones);
    }

}
