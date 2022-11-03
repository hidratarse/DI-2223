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
    boolean sumando=false;
    boolean restando=false;
    boolean multiplicando=false;
    boolean dividiendo=false;

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

        result.setText(null);

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"1");
            }
        });

        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"2");
            }
        });

        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"3");
            }
        });

        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"4");
            }
        });

        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"5");
            }
        });

        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"6");
            }
        });

        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"7");
            }
        });

        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"8");
            }
        });

        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"9");
            }
        });

        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"0");
            }
        });
        
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result == null) {
                    result.setText("");
                }else{
                    var = Integer.parseInt(result.getText()+"");
                    sumando=true;
                    result.setText(null);
                }
            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result == null) {
                    result.setText("");
                }else{
                    var = Integer.parseInt(result.getText()+"");
                    restando=true;
                    result.setText(null);
                }
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result == null) {
                    result.setText("");
                }else{
                    var = Integer.parseInt(result.getText()+"");
                    multiplicando=true;
                    result.setText(null);
                }
            }
        });

        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result == null) {
                    result.setText("");
                }else{
                    var = Integer.parseInt(result.getText()+"");
                    dividiendo=true;
                    result.setText(null);
                }
            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var2=Integer.parseInt(result.getText()+"");
                if (sumando){
                    result.setText(String.valueOf(var+var2));
                    sumando=false;
                }
                if (restando){
                    result.setText(String.valueOf(var-var2));
                    restando=false;
                }

                if (multiplicando){
                    result.setText(String.valueOf(var*var2));
                    multiplicando=false;
                }

                if (dividiendo){
                    if (var2==0){
                        result.setText("");
                    }
                    else{
                        result.setText(String.valueOf(var/var2));
                    }
                    dividiendo=false;
                }
            }
        });

        borrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
            }
        });
    }
}