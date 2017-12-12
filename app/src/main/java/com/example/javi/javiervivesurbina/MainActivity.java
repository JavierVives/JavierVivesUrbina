package com.example.javi.javiervivesurbina;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Producto> productos;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView)findViewById(R.id.lv);

        productos = new ArrayList<>();
        productos.add(new Producto(1, "Televisor LG F21-40",R.drawable.televisor_lg, 399,  "Televisor imagen 4K de 40 pulgadas 400Mhz") );
        productos.add(new Producto(2, "Microcadena Sony HT-100sd",R.drawable.minicadena_sony , 199, "Cadena musical conexión USB y iPod 40W"));
        productos.add(new Producto(3, "Plancha Rowenta Soft FX-1",R.drawable.plancha_rowenta ,90, "Plancha profesional 7 funciones de planchado 1800W"));
        productos.add(new Producto(4, "Ordenador Portatil Acer R235",R.drawable.portatil_acer , 589.90, "Ordenador Portatil Acer I5, 8GB, SSD240GB"));


        ArrayAdapterProducto arrayAdapter = new ArrayAdapterProducto(this,0, productos);

        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                Intent i = new Intent(MainActivity.this, ProductoActivity.class);
                String message = "abc";
                i.putExtra("nombreProducto",productos.get(position).getNombreProducto());
                i.putExtra("imagen",productos.get(position).getImagen());
                i.putExtra("precio",productos.get(position).getPrecio());
                i.putExtra("descripción",productos.get(position).getDescripción());
                i.putExtra("idProducto",productos.get(position).getIdProducto());
                startActivity(i);
            }
        });
    }
}
