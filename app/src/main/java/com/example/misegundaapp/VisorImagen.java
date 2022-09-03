package com.example.misegundaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class VisorImagen extends AppCompatActivity {
    Uri uri;
    //Double datoinicial;
    //Double datofinal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor_imagen);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //Poner Icono
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        TextView tituloresto = (TextView) findViewById(R.id.titulorestoText);
        TextView detallesresto = (TextView) findViewById(R.id.detallerestoText);
        detallesresto.setMovementMethod(new ScrollingMovementMethod());
        TextView inicioresto = (TextView) findViewById(R.id.iniciorestoText);
        TextView finresto = (TextView) findViewById(R.id.finrestoText);
        ImageView imgresto = (ImageView) findViewById(R.id.imgrestoGrande);
        ImageView imgMaps = (ImageView) findViewById(R.id.imagenclickMaps);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();


        if (b != null) {
            imgresto.setImageResource(b.getInt("IMG"));
            tituloresto.setText(b.getString("TIT"));
            detallesresto.setText(b.getString("DES"));
            inicioresto.setText(b.getString("INI"));
            finresto.setText(b.getString("FIN"));

            //las coordenadas contenidas como texto en el arreglo seran convertidas a Double
            // para que puedan ser consideradas en el Metodo showMap(Uri geoLocation).

            double dato1 =Double.parseDouble((String)inicioresto.getText());
            double dato2 =Double.parseDouble((String)finresto.getText());

            String name = tituloresto.getText().toString();

            //uri = Uri.parse("geo:"+dato1+","+dato2+"?q="+dato1+","+dato2+(name));
            uri = Uri.parse("geo:"+dato1+","+dato2+"?q=" + Uri.encode(name));

            imgMaps.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    showMap(uri);
                }
            });
        }
    }

    //Metodo de llamada al Mapa del restaurant o negocio seleccionado !!

    public void showMap(Uri geoLocation) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(geoLocation);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }


}


