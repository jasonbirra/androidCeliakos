package com.example.misegundaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class visorinfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visorinfo);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //Poner Icono
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        TextView tituloinfo = (TextView) findViewById(R.id.Textinfotitulo);
        TextView detallesinfo = (TextView) findViewById(R.id.Textinfodetalle);
        detallesinfo.setMovementMethod(new ScrollingMovementMethod());
        ImageView imginfo = (ImageView) findViewById(R.id.infoImg);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if (b != null) {
            imginfo.setImageResource(b.getInt("IMG"));
            tituloinfo.setText(b.getString("TIT"));
            detallesinfo.setText(b.getString("DES"));
        }
    }
}