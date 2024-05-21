package com.yesicaz.controldeseleccion;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class seleccion2 extends AppCompatActivity {
RadioButton rbFemenino, rbMasculino;
  CheckBox Ingles ,Español, Italiano;
  RadioGroup rgGenero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion2);

        referenciar();
    }

    private void referenciar() {
        rbFemenino =findViewById(R.id.rbFemenino);
        rbMasculino = findViewById(R.id.rbMasculino);
        rgGenero = findViewById(R.id.rgGenero);
        Ingles = findViewById(R.id.ingles);
        Español = findViewById(R.id.español);
        Italiano= findViewById(R.id.italiano);
        rgGenero.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rbFemenino){
                    Toast.makeText(seleccion2.this, "usted es de genero femenino ", Toast.LENGTH_SHORT).show();

                } else if (checkedId==R.id.rbMasculino) {
                    Toast.makeText(seleccion2.this, "usted es de genero masculino", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Ingles.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(seleccion2.this, "usted habla ingles", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(seleccion2.this, "usted quito la seleccion de  ingles", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Español.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(seleccion2.this, "usted habla Español", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(seleccion2.this, "usted quito la seleccion de  Español", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Italiano.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(seleccion2.this, "usted habla italiano", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(seleccion2.this, "usted quito la seleccion de  italiano", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}