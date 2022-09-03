package com.example.misegundaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class listaresto extends AppCompatActivity {

    ListView lista;
    String [][] datos = {

            {"restaurant1","Merluza Loca","En primer lugar se encuentra este restaurant de Viña del Mar que propone una cocina creativa e innovadora que con significativos detalles, como el uso de ingredientes extraídos de su propia huerta orgánica, o el delicado montaje de sus platos, logran que el local entregue una experiencia única a cada persona que los visita. Más información https://www.merluzaloca.cl/","-33.051885164586054","-71.35757944636856"},
            {"restaurant2","Rincon Porteño","La refinada gastronomía de Francia llegó a Valparaiso en manos de una pareja de franceses quienes se encargaron de traer la esencia culinaria de su región a la Ciudad Jardín. Asimismo, son ellos los que se encargan de que cada una de sus preparaciones sean elaboradas con la mayor dedicación, lo que permitió que en solo dos años se posicionaran entre los mejores restaurantes de la zona. Mas información http://www.rinconporteno.cl","-33.03472167595398","-71.43223470218585"},
            {"restaurant3","Cafe sin culpa","Villa Alemana","-33.04530051435454","-71.37539330218561"},
            {"restaurant4","Pastas Sin Gluten Santa Eugenia","Si esta buscando pasta sin gluten en el mercado, Santa Eugenia te ofrece una amplia variedad de Pastas Artesanales, precisamente con la calidad y el nivel de comodidad que desea para su cocina e invitados. Todos los productos son congelados, de preparacion rapida y fiable. Un ahorro de tiempo para su cocina, y un placer garantizado sin restricciones en su hogar.  ","-33.01926445316251","-71.55909453102292"},
            {"restaurant5","Likuram, Delicias Gluten Free","Comenzaron instalados en pleno Valparaíso donde sus mejores clientes eran los turistas que, como muchos en nuestro país, no consumen gluten por opción o por sufrir alguna intolerancia o alergia a este. Likuram  surge en respuesta a los cambios de la alimentación que nuestra sociedad está experimentando y, es por esto, que no sólo se trata de comida libre de gluten, sino que también cuentan en su carta con platos libres de lactosa, caseína, soya o veganos.\n" +
                    "\n" +
                    "En sus inicios desarrollaron panes y se especializaron en la pastelería, pero al detectar una necesidad alimentaria mucho mayor y compleja decidieron aventurarse con una carta más amplia. Hoy son un restaurante hecho y derecho, un verdadero paraíso para quienes no podemos consumir gluten. Y decidieron trasladarse a Viña puesto que muchos de sus clientes son de la zona, y claro, en Valpo tenían a los turistas, pero la misión que se propusieron es la de contribuir a las pancitas olvidadas de nuestra sociedad.","-33.008043449844145","-71.54975600218661"}
    };

    int[] datosImg = {R.drawable.restaurant1,R.drawable.restaurant2,R.drawable.restaurant3,R.drawable.restaurant4,R.drawable.restaurant5};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listaresto);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //Poner Icono
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        lista = (ListView) findViewById(R.id.lvlista);
        lista.setAdapter(new Adaptador(this, datos, datosImg));



    }
}
