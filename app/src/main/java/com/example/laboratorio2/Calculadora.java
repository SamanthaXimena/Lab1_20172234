package com.example.laboratorio2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Calculadora extends AppCompatActivity {


    /* //opcion1
    TextView texto_Resultado;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operacion = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculadora);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView leftIcon = findViewById(R.id.left_icon2);
        TextView title = findViewById(R.id.toolbar_title2);
        ImageView rightIcon = findViewById(R.id.right_icon);

        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity2.this , MainActivity.class);

                Intent intent = new Intent(Calculadora.this, PaginaInicial.class);
                startActivity(intent);
            }
        });

        rightIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity2.this , MainActivity.class);

                Intent intent = new Intent(Calculadora.this, Historial.class);
                startActivity(intent);
            }
        });

        title.setText("TeleMath");

// SECCION CALCULADORA
        texto_Resultado = findViewById(R.id.numero2);
        //texto_Resultado.setText("PRUEBAA");

    }

    public void EscribirSiete(View view){
        numero1 = Float.parseFloat(texto_Resultado.getText().toString()); // texyto combierte en string

        if(numero1 == 0.0f){
            texto_Resultado.setText("7");
        }else{
            texto_Resultado.setText(texto_Resultado.getText() + "7");
        }
    }

    public void EscribirOcho(View view){
        numero1 = Float.parseFloat(texto_Resultado.getText().toString()); // texyto combierte en string
        numero2 = Float.parseFloat(texto_Resultado.getText().toString());

        if(numero1 == 0.0f){
            texto_Resultado.setText("8");
        }else{
            texto_Resultado.setText(texto_Resultado.getText() + "8");
        }
    }


    public void BorrarNumero(View view){
        texto_Resultado.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";
    }

    public void operacion_dividir(View view){

        numero1 = Float.parseFloat(texto_Resultado.getText().toString());
        numero2 = Float.parseFloat(texto_Resultado.getText().toString());
        operacion = "/";
        texto_Resultado.setText("0");

    }
    public void mostrar_resultado(View view){

        numero2 = Float.parseFloat(texto_Resultado.getText().toString());
        if(operacion.equals("/")){
            if(numero2 == 0.0f){
                texto_Resultado.setText("0");
                Toast.makeText(this, "operacion no valida", Toast.LENGTH_LONG).show();
            }else{
                float result = numero1/numero2;
                texto_Resultado.setText(result + "");
            }
        }
    }

     */

    //opcion2

    TextView numero_1;
    TextView numero_2;
    int oper = 0;
    Double num1 = 0.0;
    Double num2;
    Double resp = 0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculadora);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView leftIcon = findViewById(R.id.left_icon2);
        TextView title = findViewById(R.id.toolbar_title2);
        ImageView rightIcon = findViewById(R.id.right_icon);

        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity2.this , MainActivity.class);

                Intent intent = new Intent(Calculadora.this, PaginaInicial.class);
                startActivity(intent);
            }
        });

        rightIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity2.this , MainActivity.class);

                Intent intent = new Intent(Calculadora.this, Historial.class);
                startActivity(intent);
            }
        });

        title.setText("TeleMath");

        numero_1= findViewById(R.id.numero1);
        numero_2= findViewById(R.id.numero2);
        Button btnborrar = findViewById(R.id.btnCLR);
        Button btnigual = findViewById(R.id.btnIgual);

        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Double.parseDouble(numero_2.getText().toString());

                switch (oper){

                    case 1:
                        resp = num1+num2;
                    case 2:
                        resp = num1-num2;
                    case 3:
                        resp = num1*num2;
                    case 4:
                        resp = num1/num2;
                }

                numero_2.setText(resp.toString());
                numero_1.setText(" ");
            }
        });

        btnborrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero_1.setText(" ");
                numero_2.setText(" ");
                num1 = 0.0;
                oper = 0;
            }
        });

    }

    public void presionarboton(View view) {
            TextView numero_2;
            numero_2 = findViewById(R.id.numero2);
            String Num2;
            Num2 = numero_2.getText().toString();

            if(view.getId() == R.id.btn0){
                numero_2.setText(Num2 + "0");
            }else if (view.getId() == R.id.btn1) {
                numero_2.setText(Num2 + "1");
            }else if (view.getId() == R.id.btn2) {
                numero_2.setText(Num2 + "2");
            }else if (view.getId() == R.id.btn3) {
                numero_2.setText(Num2 + "3");
            }else if (view.getId() == R.id.btn4) {
                numero_2.setText(Num2 + "4");
            }else if (view.getId() == R.id.btn5) {
                numero_2.setText(Num2 + "5");
            }else if (view.getId() == R.id.btn6) {
                numero_2.setText(Num2 + "6");
            }else if (view.getId() == R.id.btn7) {
                numero_2.setText(Num2 + "7");
            }else if (view.getId() == R.id.btn8) {
                numero_2.setText(Num2 + "8");
            }else if (view.getId() == R.id.btn9) {
                numero_2.setText(Num2 + "9");
            }

    }

    public void clickoperacion(View view) {
        num1 = Double.parseDouble(numero_2.getText().toString());

        String prueba_numero;
        prueba_numero = numero_2.getText().toString();

        numero_2.setText(" ");

        if (view.getId() == R.id.btnSumar) {
            numero_1.setText(prueba_numero + "+");
            oper = 1;
        } else if (view.getId() == R.id.btnRestar) {
            numero_1.setText(prueba_numero + "-");
            oper = 2;
        } else if (view.getId() == R.id.btnMultiplicar) {
            numero_1.setText(prueba_numero + "*");
            oper = 3;
        } else if (view.getId() == R.id.btnDividir) {
            numero_1.setText(prueba_numero + "/");
            oper = 4;

        }


    }
    }


