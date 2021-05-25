package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.practica2.actividad1.ViewOneActivity;
import com.example.practica2.actividad2.CalculadoraActivity;
import com.example.practica2.actividad3.DimensionesDePantallaActivity;
import com.example.practica2.actividad4.TomarFotoActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_actividades,menu);
        return true;
    }

    public boolean onOptionsItemSelect(MenuItem item){
        int id =item.getItemId();
        Intent intent;
        switch(item.getItemId()) {
            case R.id.activity_one:
                 intent = new Intent(this, ViewOneActivity.class);
                startActivity(intent);
                break;
            case R.id.activity_calculadora:
                 intent = new Intent(this, CalculadoraActivity.class);
                startActivity(intent);
                break;
            case R.id.activity_dimensiones:
                 intent = new Intent(this, DimensionesDePantallaActivity.class);
                startActivity(intent);
                break;
            case R.id.activity_tomar_foto:
                 intent = new Intent(this, TomarFotoActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}