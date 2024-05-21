package com.yesicaz.controldeseleccion;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class El_chico_y_la_garza extends AppCompatActivity {
    MediaPlayer cancionPs;
    ImageView volumen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_el_chico_yla_garza);
        volumen = findViewById(R.id.volumen);
        cancionPs = MediaPlayer.create(this, R.raw.susume);
        volumen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cancionPs.isPlaying()) {
                    cancionPs.pause();

                } else {
                    cancionPs.start();

                }

            }
        });
    }
}