package com.example.final_intent1;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.core.view.WindowInsetsCompat;
public class Acima extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acima_do_peso);

        float imcRecebido = getIntent().getFloatExtra("IMC", 0.0f);
        TextView txtImc = findViewById(R.id.imcacima);
        txtImc.setText("Seu IMC é: " + String.format("%.2f", imcRecebido));

        Button voltarAcima = findViewById(R.id.Acima);

        voltarAcima.setOnClickListener(v-> {
            Intent voltar = new Intent(this, MainActivity.class);
            voltar.setAction(Intent.ACTION_VIEW);
            startActivity(voltar);

        });
    }

    //O autocomplete do 'v' está dando errado agora e não consegui fazer funcionar e é chato de fazer manualmente


}