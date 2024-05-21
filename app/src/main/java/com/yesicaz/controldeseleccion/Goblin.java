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

public class Goblin extends AppCompatActivity {
    MediaPlayer cancionPs;
    ImageView volumen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goblin);
        volumen = findViewById(R.id.volumen);
        cancionPs = MediaPlayer.create(this, R.raw.goblin);

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




