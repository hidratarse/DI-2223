package com.example.calculaeitor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {
    TextView result;
    Button cero, uno,dos,tres,cuatro,cinco, seis, siete, ocho, nueve, igual, suma, resta, multi, divi, borrado;
    int var, var2;
    boolean operado=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        result=findViewById(R.id.pantalla);
        cero=findViewById(R.id.b0);
        uno=findViewById(R.id.b1);
        dos=findViewById(R.id.b2);
        tres=findViewById(R.id.b3);
        cuatro=findViewById(R.id.b4);
        cinco=findViewById(R.id.b5);
        seis=findViewById(R.id.b6);
        siete =findViewById(R.id.b7);
        ocho=findViewById(R.id.b8);
        nueve=findViewById(R.id.b9);
        igual=findViewById(R.id.bigual);
        suma=findViewById(R.id.bsuma);
        resta=findViewById(R.id.bresta);
        multi=findViewById(R.id.x);
        divi=findViewById(R.id.dividir);
        borrado=findViewById(R.id.C);



        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var=Integer.parseInt(result.getText().toString());
                if (var==0 || operado) {
                    result.setText("1");
                    operado=false;
                }else{
                    result.setText(var+"1");
                }
            }
        });

        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var=Integer.parseInt(result.getText().toString());
                if (var==0 || operado) {
                    result.setText("2");
                    operado=false;
                }else{
                    result.setText(var+"2");
                }
            }
        });
    }
}