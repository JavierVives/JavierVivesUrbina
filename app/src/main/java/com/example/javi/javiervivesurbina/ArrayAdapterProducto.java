package com.example.javi.javiervivesurbina;

/**
 * Created by Javi on 12/12/2017.
 */

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayAdapterProducto extends ArrayAdapter<Producto> {
    private Context context;
    private ArrayList<Producto> productos;

    //constructor, call on creation
    public ArrayAdapterProducto(Context context, int resource, ArrayList<Producto> productos) {
        super(context, resource, productos);

        this.context = context;
        this.productos = productos;
    }

    //called when rendering the list
    public View getView(int position, View convertView, ViewGroup parent) {
        Producto property = productos.get(position);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.lista_layout, null);

        TextView tvNom = (TextView) view.findViewById(R.id.tvNom);
        TextView tvDesc = (TextView) view.findViewById(R.id.tvDesc);
        TextView tvPre = (TextView) view.findViewById(R.id.tvPre);
        ImageView ivImagen = (ImageView) view.findViewById(R.id.ivImagen);
        TextView tvCod = (TextView) view.findViewById(R.id.tvCod);

        tvNom.setText(property.getNombreProducto());
        tvDesc.setText(property.getDescripción());
        tvPre.setText(Double.toString(property.getPrecio()));
        /*tvCod.setText(Integer.toString(property.getIdProducto()));*/
        ivImagen.setImageResource(property.getImagen());
        return view;
    }
}

