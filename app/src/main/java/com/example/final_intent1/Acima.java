package com.example.final_intent1;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.core.view.WindowInsetsCompat;
public class Acima extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acima_do_peso);
    }


    Button voltarAcima = findViewById(R.id.Acima);
    void Homepage() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    //O autocomplete do 'v' está dando errado agora e não consegui fazer funcionar e é chato de fazer manualmente
    voltarAcima.setOnClickListener(View v->

    {
        Intent voltar = new Intent(this, MainActivity.class);
        voltar.setAction(Intent.ACTION_VIEW);
        startActivity(voltar);

    });


}