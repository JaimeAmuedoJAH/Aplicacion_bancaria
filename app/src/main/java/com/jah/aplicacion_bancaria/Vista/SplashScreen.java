package com.jah.aplicacion_bancaria.Vista;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.jah.aplicacion_bancaria.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                Intent inicio = new Intent(getApplicationContext(), ActivityInicioSesion.class);
                finish();
                startActivity(inicio);
            }
        };
        timer.schedule(timerTask, 2000);
    }
}