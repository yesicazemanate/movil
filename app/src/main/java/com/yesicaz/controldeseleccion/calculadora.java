package com.yesicaz.controldeseleccion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class calculadora extends AppCompatActivity {
RadioButton Televisor, Radio;
CheckBox descuento;
EditText precio, Descuento, result;
Button calcular;
RadioGroup electrodomestico;
    float precioTelevisor = 2000000f;
    float precioRadio = 130000f;
    float descuentotele;
    float descuentoRadio;
    float valortele;
    float valorradio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
Televisor = findViewById(R.id.Televisor);
Radio = findViewById(R.id.Radio);
descuento = findViewById(R.id.descuentodiez);
precio = findViewById(R.id.precio);
Descuento = findViewById(R.id.descuento);
result = findViewById(R.id.result);
calcular = findViewById(R.id.calcular);
electrodomestico = findViewById(R.id.electrodomestico);

electrodomestico.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if(checkedId== R.id.Televisor){
            precio.setText(String.valueOf(precioTelevisor));
            descuento.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                       descuentotele = (precioTelevisor*10)/100;
                       Descuento.setText(String.valueOf(descuentotele));
                    }else{
                        Toast.makeText(calculadora.this, "seleccione algun electrodomestico", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            calcular.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    valortele = precioTelevisor - descuentotele;
                    result.setText(String.valueOf(valortele));

                }
            });
        } else if (checkedId== R.id.Radio) {
            precio.setText(String.valueOf(precioRadio));
            descuento.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        descuentoRadio = (precioRadio*10)/100;
                        Descuento.setText(String.valueOf(descuentoRadio));
                    }else{
                        Toast.makeText(calculadora.this, "seleccione algun electrodomestico", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            calcular.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    valorradio = precioRadio - descuentoRadio;
                    result.setText(String.valueOf(valorradio));

                }
            });
        }
    }
});



    }
}