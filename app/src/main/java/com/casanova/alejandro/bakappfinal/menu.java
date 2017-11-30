package com.casanova.alejandro.bakappfinal;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class menu extends AppCompatActivity {

    Button boton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        ImageView mandarActividad = (ImageView) findViewById(R.id.imageCalcular);
        mandarActividad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(menu.this, calculadora.class);
                startActivity(intent2);
            }
        });
        ImageView conocenos = (ImageView) findViewById(R.id.imageConocenos);
        conocenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(menu.this, conocenosActivity.class);
                startActivity(intent3);
            }
        });

        final ImageView nuestrosProductos = (ImageView) findViewById(R.id.nuestrosProductosImagen);
        nuestrosProductos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(menu.this, productosLista.class);
                startActivity(intent5);

            }
        });


    }
}

