package com.example.laboratorio2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PaginaInicial extends AppCompatActivity {

    // Declaracion de las variables boton
    Button Indicaciones;
    Button Calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_paginainicial);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Boton indicaciones
        Indicaciones = (Button) findViewById(R.id.IdBoton_1);
        Indicaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PaginaInicial.this, com.example.laboratorio2.Indicaciones.class);
                startActivity(intent);
            }
        });

        // Boton Calcular
        Calcular = (Button) findViewById(R.id.IdBoton_2);
        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PaginaInicial.this, Calculadora.class);
                startActivity(intent);
            }
        });
    }

}
//  boton calculadora dentro del actividad 2
// boton calculadora alinear
//color del texto, cambie de colores
//hacer un form