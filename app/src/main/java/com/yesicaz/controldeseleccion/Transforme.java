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

public class Transforme extends AppCompatActivity {
    MediaPlayer cancionPs;
    ImageView volumen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_transforme);
        volumen = findViewById(R.id.volumen);
        cancionPs = MediaPlayer.create(this, R.raw.trasformer);
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