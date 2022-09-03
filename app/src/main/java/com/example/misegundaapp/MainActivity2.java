package com.example.misegundaapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Poner Icono
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }
    // Llamados a las Opciones del Menu (4), Mediante "METODOS"
    public void llamarLista(View view) {
        Intent intent = new Intent(this, listaresto.class);
        startActivity(intent);
    }

    public void llamarTips(View view) {
        Intent intent = new Intent(this, listatips.class);
        startActivity(intent);
    }

    public void llamarInfo(View view) {
        Intent intent = new Intent(this, listainfo.class);
        startActivity(intent);
    }

    public void llamaForm(View view) {
        Uri uriUrl = Uri.parse("https://forms.gle/2TxKVteiP2DvaGWP9");
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}