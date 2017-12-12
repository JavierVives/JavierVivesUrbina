package com.example.javi.javiervivesurbina;

/**
 * Created by Javi on 12/12/2017.
 */

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class ProductoActivity extends AppCompatActivity {

    TextView tvNom;
    ImageView ivImagen;
    TextView tvPre;
    TextView tvCod;
    TextView tvDesc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        setContentView(R.layout.activity_producto);

        TextView tvNom = (TextView)findViewById(R.id.tvNom);
        tvNom.setText(bundle.getString( "nombreProducto" ));
        ImageView ivImagen = (ImageView) findViewById(R.id.ivImagen);
        ivImagen.setImageResource(bundle.getInt("imagen"));
        TextView tvDesc = (TextView)findViewById(R.id.tvDesc);
        tvNom.setText(bundle.getString( "descripción" ));
        TextView tvPre = (TextView)findViewById(R.id.tvPre);
        tvNom.setText(Double.toString(bundle.getDouble( "precio" )));
        TextView tvCod = (TextView)findViewById(R.id.tvCod);
        tvCod.setText(Integer.toString(bundle.getInt( "idProducto" )));
    }

}
