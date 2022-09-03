package com.example.misegundaapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptadortips extends BaseAdapter {

    private static LayoutInflater inflater = null;

    Context contexto;
    String [][] datos;
    int[] datosImg;

    public Adaptadortips(Context conexto, String[][] datos, int[] imagenes)
    {
        this.contexto = conexto;
        this.datos = datos;
        this.datosImg = imagenes;
        inflater = (LayoutInflater)conexto.getSystemService(conexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        final View vista =  inflater.inflate(R.layout.listadotips, null);
        TextView titulotips = (TextView) vista.findViewById(R.id.tipstituloText);
        TextView detalletips = (TextView) vista.findViewById(R.id.tipsdetalleText);
        ImageView imagentips = (ImageView) vista.findViewById(R.id.tipsImg);
        titulotips.setText (datos [i][1]);
        detalletips.setText (datos [i][2]);
        imagentips.setImageResource(datosImg[i]);


        imagentips.setTag(i);
        imagentips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Visor = new Intent(contexto, visortips.class);
                Visor.putExtra("IMG", datosImg[(Integer)v.getTag()]);
                Visor.putExtra("TIT", datos[i][1]);
                Visor.putExtra("DES", datos[i][2]);

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
