package com.example.misegundaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.os.Handler;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvTexto;
    ProgressBar progressBar;
    Button btnBoton;
    int progreso = 0;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Poner Icono
        //getSupportActionBar().setDisplayShowHomeEnabled(true);
        //getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);



        progressBar = findViewById(R.id.pbHorizontal);
        tvTexto = findViewById(R.id.tvTexto);
        btnBoton = findViewById(R.id.button);

        // INICIA EL HILO CON LA ACCION DEL PROGRESS BAR
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (progreso < 100) {
                    progreso = progreso + 1;
                    // ACTUALIZA EL PROGRESS BAR Y ACTUALIZA EL TEXT VIEW
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            progressBar.setProgress(progreso);
                            if(progreso == 100) {
                                Toast.makeText(MainActivity.this, "Carga completada", Toast.LENGTH_LONG).show();
                               //btnBoton.setVisibility(View.VISIBLE);
                               progressBar.setVisibility(View.INVISIBLE);
                               tvTexto.setVisibility(View.INVISIBLE);
                               Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                               startActivity(intent);
                               finish();
                            }
                            tvTexto.setText(progreso + "% / " + progressBar.getMax()+"%");
                        }
                    });
                    try {
                        // DUERME EL HILO POR 30 MILISEGUNDOS
                        Thread.sleep(30);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

    }

    //Llamada del Activity de Menu Prinicipal.
    public void llamarMenu(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}