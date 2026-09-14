package com.example.final_intent1;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.core.view.WindowInsetsCompat;
public class Saudavel extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saudavel);

        float imcRecebido = getIntent().getFloatExtra("IMC", 0.0f);
        TextView txtImc = findViewById(R.id.imcsaudavel);
        txtImc.setText("Seu IMC é: " + String.format("%.2f", imcRecebido));

        Button voltarSaudavel = findViewById(R.id.HOME1);

        voltarSaudavel.setOnClickListener(v -> {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        });
    }
}