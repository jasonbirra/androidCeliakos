package com.example.misegundaapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {


    private static LayoutInflater inflater = null;

    Context contexto;
    String [][] datos;
    int[] datosImg;

    public Adaptador(Context conexto, String[][] datos, int[] imagenes)
    {
        this.contexto = conexto;
        this.datos = datos;
        this.datosImg = imagenes;
        inflater = (LayoutInflater)conexto.getSystemService(conexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        final View vista =  inflater.inflate(R.layout.restoslist, null);
        TextView tituloresto = (TextView) vista.findViewById(R.id.tvrestoTitulo);
        TextView descripcionresto = (TextView) vista.findViewById(R.id.tvrestoDescripcion);
        TextView inicioresto = (TextView) vista.findViewById(R.id.tvrestoInicio);
        TextView finresto = (TextView) vista.findViewById(R.id.tvrestoFin);
        ImageView imagenresto = (ImageView) vista.findViewById(R.id.ivrestoImagen);
        tituloresto.setText (datos [i][1]);
        descripcionresto.setText (datos [i][2]);
        inicioresto.setText (datos [i][3]);
        finresto.setText (datos [i][4]);
        imagenresto.setImageResource(datosImg[i]);


        imagenresto.setTag(i);
        imagenresto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Visor = new Intent(contexto, VisorImagen.class);
                Visor.putExtra("IMG", datosImg[(Integer)v.getTag()]);
                Visor.putExtra("TIT", datos[i][1]);
                Visor.putExtra("DES", datos[i][2]);
                Visor.putExtra("INI", datos[i][3]);
                Visor.putExtra("FIN", datos[i][4]);
                contexto.startActivity(Visor);
            }
        });
        return vista;
    }

    @Override
    public int getCount() {

        return datosImg.length;
    }

    @Override
    public Object getItem(int position) {

        return null;
    }

    @Override
    public long getItemId(int position) {

        return 0;
    }
}