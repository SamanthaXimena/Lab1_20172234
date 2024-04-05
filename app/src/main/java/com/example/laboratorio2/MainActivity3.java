package com.example.laboratorio2;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    TextView texto_Resultado;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView leftIcon = findViewById(R.id.left_icon2);
        TextView title = findViewById(R.id.toolbar_title2);

        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity2.this , MainActivity.class);

                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        });

        title.setText("TeleMath");

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


}