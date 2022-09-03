package com.example.misegundaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.ListView;

public class listatips extends AppCompatActivity {

    ListView lista;
    String [][] datos = {

            {"marco1","Tips  Alimenticios","Si vas a preparar comida, has de comenzar por los platos para los celíacos y después por los demás. No los cocines a la vez."},
            {"marco1","Tips  Cuidados del Hogar","No uses utensilios de cocina en comidas con y sin gluten indistintamente. Los utensilios para cocinar alimentos sin estas proteínas deben estar bien limpios. Incluido el horno, sobre todo si es de aire. Si no es de esta forma, pon un papel de aluminio encima de la bandeja antes de cocinar."},
            {"marco1","Tips  Alimenticios","Si el celíaco es adicto al pan, es recomendable que tengas dos sandwicheras y dos tostadoras, de esta manera no habrá problema de contaminación y podrá disfrutar de sus tostadas y bocadillos calientes sin gluten."},
            {"marco1","Tips  Sociales","En situaciones donde haya confianza y compartir, por ejemplo, una botella de agua parezca cuestión de vida o muerte, como en la playa, es bueno que el celiaco tenga la suya propia."},
            {"marco1","Tips Cuidados del Hogar","En tu despensa, los alimentos con y sin gluten deben ser almacenados cuidadosamente aparte, para así evitar que se confundan y controlar mejor la contaminación cruzada. Es conveniente colocar los «sin» en las estanterías superiores."}
    };

    int[] datosImg = {R.drawable.marco1,R.drawable.marco1,R.drawable.marco1,R.drawable.marco1,R.drawable.marco1};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listatips);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //Poner Icono
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        lista = (ListView) findViewById(R.id.lvlistatips);
        lista.setAdapter(new Adaptadortips(this, datos, datosImg));



    }
}