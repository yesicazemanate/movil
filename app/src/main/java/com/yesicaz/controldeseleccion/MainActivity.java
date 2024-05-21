package com.yesicaz.controldeseleccion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
ListView listPeliculas;
Spinner spFrutas;
String[] frutas = new String[]{"Manzana", "Papaya", "Fresa", "Mora", "Curuba"};
    String[] peliculas = new String[]{"La princesa y el sapo", "Trasnformer", "EL chico y la garza", " It", "goblin "};
  ArrayAdapter<String> adapterFrutas, adapterPeliculas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       referenciar();

       adapterPeliculas = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, peliculas);
       listPeliculas.setAdapter(adapterPeliculas);
       adapterFrutas = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, frutas);
       spFrutas.setAdapter(adapterFrutas);
    }
    private void referenciar(){
        listPeliculas= findViewById(R.id.listPeliculas);
        spFrutas= findViewById(R.id.spFrutas);
        spFrutas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "seleccionó " + parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

listPeliculas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(MainActivity.this, "usted presiono " + parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
        if (position == 0) {
            Intent goNext = new Intent(MainActivity.this, La_princesa_y_el_sapo.class);
            startActivity(goNext);

        } else if (position==1) {
            Intent goNext = new Intent(MainActivity.this, Transforme.class);
            startActivity(goNext);
        } else if (position==2) {
            Intent goNext = new Intent(MainActivity.this, El_chico_y_la_garza.class);
            startActivity(goNext);

        } else if (position==3) {
            Intent goNext = new Intent(MainActivity.this, iT.class);
            startActivity(goNext);

        }else {
            Intent goNext = new Intent(MainActivity.this, Goblin.class);
            startActivity(goNext);
        }
    }
});

}}