package com.casanova.alejandro.bakappfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class calculadora extends AppCompatActivity {
    Spinner razas, actividad, edad, datoPeso;
    private String peso, prueba;
    private  Double pesoGramos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        razas = (Spinner) findViewById(R.id.spinnerRaza);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.arrayRazas, android.R.layout.simple_spinner_item);
        razas.setAdapter(adapter1);

        datoPeso = (Spinner) findViewById(R.id.spinnerPeso);
        ArrayAdapter<CharSequence> adapter0 = ArrayAdapter.createFromResource(this, R.array.unidadesPeso, android.R.layout.simple_spinner_item);
        datoPeso.setAdapter(adapter0);

        actividad = (Spinner) findViewById(R.id.spinnerActividad);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.arrayActividad, android.R.layout.simple_spinner_item);
        actividad.setAdapter(adapter2);

        edad = (Spinner) findViewById(R.id.spinnerEdad);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.arrayEdad, android.R.layout.simple_spinner_item);
        edad.setAdapter(adapter3);

        Button calculaAhora;


        calculaAhora = (Button) findViewById(R.id.calcularAhoraBoton);
        calculaAhora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                peso = "";
                String sEdad = edad.getSelectedItem().toString();
                String sActividad = actividad.getSelectedItem().toString();
                EditText pesoText = (EditText) findViewById(R.id.pesoCaja);
                peso = pesoText.getText().toString().trim();
                String sPeso = datoPeso.getSelectedItem().toString();
                String sRaza = razas.getSelectedItem().toString();
                //Toast.makeText(getApplicationContext(),sPeso,Toast.LENGTH_LONG).show();

                //Toast.makeText(getApplicationContext(), String.format("%d", (Double) dpeso), Toast.LENGTH_LONG).show();
                if (peso.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Introduce el peso de tu Mascota", Toast.LENGTH_SHORT).show();

                } else {

                    Double dpeso = Double.parseDouble(peso);
                    pesoGramos = dpeso;
                    if (sPeso.equals("Kg")) {

                        pesoGramos = (pesoGramos * 1000);


                    }

                    prueba = new Double(pesoGramos).toString();
                        Intent intent4 = new Intent(calculadora.this, resultados.class);
                        intent4.putExtra("edadAct", sEdad);
                        intent4.putExtra("pesoAct", prueba);
                        intent4.putExtra("actAct", sActividad);
                        intent4.putExtra("razaAct", sRaza);
                        intent4.putExtra("pesoSpinner", sPeso);

                        startActivity(intent4);

                   }


            }


             });


        }

}

