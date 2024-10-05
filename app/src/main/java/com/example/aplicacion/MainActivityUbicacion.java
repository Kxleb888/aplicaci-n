package com.example.aplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivityUbicacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_ubicacion);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button button14 = findViewById(R.id.button14);

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Corrige el nombre de las actividades aquí
                Intent intent = new Intent(MainActivityUbicacion.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button button15 = findViewById(R.id.button15);

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Corrige el nombre de las actividades aquí
                Intent intent = new Intent(MainActivityUbicacion.this, MainActivityMas.class);
                startActivity(intent);
            }
        });
    }
}