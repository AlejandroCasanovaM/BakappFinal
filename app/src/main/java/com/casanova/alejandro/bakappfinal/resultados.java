package com.casanova.alejandro.bakappfinal;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class resultados extends AppCompatActivity {
    TextView mostrarComida, comidaEpaques, consejos2;
    String sEdad, spesoGramos, sRaza, sActividad, porcentaje, x;
    ImageView imagenPremios, perritos;
    String[] mensajesPremios = new String[4];
    String[] productos = new String[7];
    TextView premios;
    int y, z;
    Double pesoGramos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        /*double pesoGramos = Double.parseDouble(spesoGramos);
        mostrarComida = (TextView) findViewById(R.id.comidaPeso);
        mostrarComida.setText("Tu cachorro debe comer" + pesoGramos + "gramos al día.");
        */
        Bundle extras = getIntent().getExtras();
        sEdad = extras.getString("edadAct");
        spesoGramos = extras.getString("pesoAct");
        sRaza = extras.getString("razaAct");
        sActividad = extras.getString("actAct");
        premios = (TextView) findViewById(R.id.premiosText);
        mostrarComida = (TextView) findViewById(R.id.comidaPeso);
        comidaEpaques = (TextView) findViewById(R.id.recomendaciones);
        consejos2 = (TextView) findViewById(R.id.consejos);
        perritos = (ImageView) findViewById(R.id.imagenPerritos);

        imagenPremios = (ImageView) findViewById(R.id.premiosImagen);
        doggos();
        premiosFunción();
        comidaAlDia();
        imagenesRazas();
    }



    private void comidaAlDia () {
        productos[0] = "400";
        productos[1] = "500";
        productos[2] = "600";
        productos[3] = "700";
        productos[4] = "800";
        productos[5] = "900";
        productos[6] = "1000";

        z = ((int)(Math.random()*6));
        Integer seMeAcabanLasIdeas = Integer.parseInt(productos[z]);
        seMeAcabanLasIdeas = (int) (seMeAcabanLasIdeas / pesoGramos);
        String variable = String.valueOf(seMeAcabanLasIdeas);


        comidaEpaques.setText("Una bolsa de " + productos[z] + " gramos alcanzarán aproximadamente para " + seMeAcabanLasIdeas + " días.");



    }

    private void premiosFunción(){
        mensajesPremios[0] ="Porque tu perro se lo merece: Dale unas galletas de sardina!";
        mensajesPremios[1] ="Prueba darle a tu campeon el dia de hoy: Galletas de atún!";
        mensajesPremios[2] = "Dale a tu amigo nuestro premio del dia de hoy: Hígado de res!";
        mensajesPremios[3] = "tu perro merece que lo concientas, prueba dandole: Corazón de res!";

        y = ((int)(Math.random()*3));
        x = mensajesPremios[y];
        premios.setText(x);

        switch (y){
            case 0:
                imagenPremios.setImageResource(R.mipmap.galletassardina);
                break;
            case 1:
                imagenPremios.setImageResource(R.mipmap.galletasatun);
                break;
            case 2:
                imagenPremios.setImageResource(R.mipmap.higadores);
                break;
            case 3:
                imagenPremios.setImageResource(R.mipmap.corazonres);
                break;
        }
    }

   private void doggos () {

       pesoGramos = Double.parseDouble(spesoGramos);
       int w = ((int)(Math.random()*4));


       if (sEdad.equals("2-4 meses")) {

           switch (w){
               case 0:
                   consejos2.setText("Es recomendable que la cantidad de alimento diaria se divida en 5 porciones  y que el alimento sea complementado con los nutrimentos recomendados por su veterinario.");
                   break;
               case 1:
                   consejos2.setText("Una botella de agua caliente y un reloj que haga tic-tac envuelto en una manta pueden tranquilizarlo mucho. Pero no te preocupes demasiado – en breve se sentirá como en casa.");
                   break;
               case 2:
                   consejos2.setText("Al contrario que los bebés, los cachorros saben cuándo necesitan dormir, por lo que una vez que tu cachorro se quede dormido, no lo molestes.");
                   break;
               case 3:
                   consejos2.setText("Pon en la cama de tu cachorro una manta de su antigua cama que huela a su madre. Deja luego que explore su nuevo entorno al ritmo que quiera.");
                   break;
               case 4:
                   consejos2.setText("Recuerda: Para esta edad ya deberia de tener la primera dosis de la vacuna contra el Parvovirus");
                   break;

           }
            pesoGramos = (pesoGramos * 0.1);

           }


           if (sEdad.equals("4-6 meses")) {
               switch (w){
                   case 0:
                       consejos2.setText("Cuando salgas a dar un paseo, fíjate si tu cachorro se lame o levanta las pezuñas. El hecho de levantar una pata puede significar que tu cachorro quiere jugar, pero también que le duele una pezuña y que quiere que se la mires.");
                       break;
                   case 1:
                       consejos2.setText("La sal y la gravilla de las carreteras pueden quemar las almohadillas de un cachorro, así como la lengua y el estómago si se las lamen. En consecuencia, debes secárselas con una toalla al llegar a casa, y verificar que no quede sal ni gravilla entre los dedos.");
                           break;
                   case 2:
                       consejos2.setText("El corte de uñas no es difícil, pero debes pedir a tu veterinario o peluquero profesional de perros que te expliquen la manera de hacerlo, ya que un error puede hacer que te encuentres con la resistencia del.");
                       break;
                   case 3:
                       consejos2.setText("Se le da una vacuna que será para protección contra Moquillo canino, Adenovirus tipo 2, Hepatitis infecciosa C y Leptospirosis Y una tercera dosis de la vacuna contra el Parvovirus");
                       break;
                   case 4:
                       consejos2.setText("Es muy importante desparasitar internamente a los cachorros con cada vacunación porque, al eliminar los parásitos, se garantiza el perfecto estado de las defensas ");
                       break;

               }
               pesoGramos = pesoGramos * 0.08;

           }
           if (sEdad.equals("6-8 meses")) {
               switch (w) {
                   case 0:
                       consejos2.setText("Es bueno tener un veterinario de confianza al cual poder llevarle a nuestro perro para que le hagan chequeos de forma regular. Es la mejor forma de estar seguros de que nuestro perro este bien de salud");
                       break;
                   case 1:
                       consejos2.setText("También es muy importante desparasitar internamente a los cachorros con cada vacunación porque, al eliminar los parásitos, se garantiza el perfecto estado de las defensas.");
                       break;
                   case 2:
                       consejos2.setText("Una formacion y entrenamiento positivo de tu perro permitirá controlar sus comportamientos de forma segura y hará que el vínculo con el animal mejore.");
                       break;
                   case 3:
                       consejos2.setText("Los perros necesitan compañerismo y sentirse acompañados por nosotros. Deben de pasar el mayor tiempo posible junto a su familia, no estar siempre solos.");
                       break;
                   case 4:
                       consejos2.setText("Recuarda: A esta edad la vacuna contra la rabia debe ser aplciada.");
                       break;
               }

               pesoGramos = pesoGramos * 0.06;


           }
           if (sEdad.equals("8-12 meses")) {
               switch (w){
                   case 0:
                       consejos2.setText("Establece una rutina regular de alimentación; si se trata de un perro, sácalo de paseo con frecuencia para que haga sus necesidades.");
                       break;
                   case 1:
                       consejos2.setText("Para ayudar a que salgan todos los dientes y deje de morder los muebles, tu cachorro necesitará algún objeto indestructible como puede ser un hueso de goma o una pelota para masticar.");
                       break;
                   case 2:
                       consejos2.setText("Detecta si tu compañero presenta: pérdida de apetito, rechazo del agua, disminución o aumento súbito de peso, lentitud o rechazo a jugar, micciones frecuentes o escasas, heces con sangre o blandas, vómitos, salivación excesiva o respiración irregular.");
                       break;
                   case 3:
                       consejos2.setText("También es muy importante desparasitar internamente a los cachorros con cada vacunación porque, al eliminar los parásitos, se garantiza el perfecto estado de las defensas.");
                       break;
                   case 4:
                       consejos2.setText("Recuerda: se debe aplicar la primera vacuna pentavalente (Parvovirus/ Moquillo/ Hepatitis/ Parainfluenza / Leptospirosis).");
                       break;}
               pesoGramos = pesoGramos * 0.04;

           }
           if (sEdad.equals("Adulto")) {
               switch (w){
                   case 0:
                       consejos2.setText("Los perros no necesitan baños con tanta frecuencia como los humanos, pero cuando empiezan a oler mal o se ensucian con lodo u otros residuos, es necesario bañarlos");
                       break;
                   case 1:
                       consejos2.setText("Es esencial que el tazón de agua de tu perro siempre esté lleno con agua fresca. Los perros necesitan beber cuando están sedientos, y beber toda el agua que desean no les hará daño.");
                       break;
                   case 2:
                       consejos2.setText("Revisa si tu perro tiene pulgas o garrapatas cuando lo cepilles y elimínalas con un peine para pulgas y garrapatas. Es probable que necesites que el veterinario te dé un medicamento de buena calidad para la prevención de pulgas.");
                       break;
                   case 3:
                       consejos2.setText("Repetir anualmente la vacuna pentavalente (Parvovirus/ Moquillo/ Hepatitis / Parainfluenza / Leptospirosis)");
                       break;
                   case 4:
                       consejos2.setText("También es muy importante desparasitar internamente a los cachorros con cada vacunación porque al eliminar los parásitos, se garantiza el perfecto estado de las defensas");
                       break;}
               if (sActividad.equals("Activo")) {
                   pesoGramos = pesoGramos * 0.03;

               }
               if (sActividad.equals("Un poco activo")) {
                   pesoGramos = pesoGramos * 0.025;

               }
               if (sActividad.equals("Sedentario")) {
                   pesoGramos = pesoGramos * 0.02;
               }
           }

                        /*else {
                            Toast.makeText(getApplicationContext(), "Rayos:'v", Toast.LENGTH_SHORT).show();
                        }

                //Toast.makeText(getApplicationContext(), String.format("%s", selec), Toast.LENGTH_SHORT ).show();
            */

           porcentaje = String.valueOf(pesoGramos);
           mostrarComida.setText("Tu amigo necesita comer " + porcentaje + " gramos al día.");



   }
   private void imagenesRazas() {
       if (sRaza.equals("Razas grandes")) {
           perritos.setImageResource(R.mipmap.razagrande2);
       }
       if (sRaza.equals("Razas medianas")) {
           perritos.setImageResource(R.mipmap.razamediana2);
       }
       if (sRaza.equals("Razas pequeñas")) {
           perritos.setImageResource(R.mipmap.razapequena2);
       }
   }
 }

