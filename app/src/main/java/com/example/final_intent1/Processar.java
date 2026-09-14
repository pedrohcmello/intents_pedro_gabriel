package com.example.final_intent1;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.WindowInsetsCompat;
public class Processar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Intent dadosIMC = getIntent();
        Float altura = dadosIMC.getFloatExtra("ALTURA", 0.0f);
        Float peso = dadosIMC.getFloatExtra("PESO", 0.0f);

        Float IMC = 0.0f;
        if (altura > 0) {
            IMC = peso / (altura * altura);
        }

        if (IMC < 25.0) {
            if (IMC >= 18.5) {
                //INTENT EXPLÍCITA
                Intent i = new Intent(this, Saudavel.class);
                i.putExtra("IMC", IMC);
                startActivity(i);
            } else {
                //INTENT EXPLÍCITA
                Intent i = new Intent(this, Abaixo.class);
                i.putExtra("IMC", IMC);
                startActivity(i);
            }
        } else {
            //INTENT EXPLÍCITA
            Intent i = new Intent(this, Acima.class);
            i.putExtra("IMC", IMC);
            startActivity(i);
        }
        finish();

    }
}
