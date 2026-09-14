package com.example.final_intent1;

import android.os.Bundle;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Abaixo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abaixo);

        float imcRecebido = getIntent().getFloatExtra("IMC", 0.0f);
        TextView txtImc = findViewById(R.id.imcabaixo);
        txtImc.setText("Seu IMC é: " + String.format("%.2f", imcRecebido));

        Button voltarAbaixo = findViewById(R.id.voltarAbaixo);
        voltarAbaixo.setOnClickListener(v -> {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        });
    }




}