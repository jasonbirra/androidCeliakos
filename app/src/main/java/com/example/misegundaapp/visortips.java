package com.example.misegundaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class visortips extends AppCompatActivity {

    //Uri uri;
    //Double datoinicial;
    //Double datofinal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visortips);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //Poner Icono
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        TextView titulotips = (TextView) findViewById(R.id.tipstituloText);
        TextView detallestips = (TextView) findViewById(R.id.tipsdetalleText);
        ImageView imgtips = (ImageView) findViewById(R.id.tipsimgGrande);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if (b != null) {
            imgtips.setImageResource(b.getInt("IMG"));
            titulotips.setText(b.getString("TIT"));
            detallestips.setText(b.getString("DES"));


        }
    }



}