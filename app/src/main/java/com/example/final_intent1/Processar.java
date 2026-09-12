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

        Float IMC = peso/(altura * altura);

        if (IMC < 25.0) {
            if (IMC >= 18.5) {
                Intent i = new Intent(this, Saudavel.class);
                i.putExtra("IMC", IMC);
                startActivity(i);
            } else {
                Intent i = new Intent(this, Abaixo.class);
                i.putExtra("IMC", IMC);
                startActivity(i);
            }
        } else {
            Intent i = new Intent(this, Acima.class);
            i.putExtra("IMC", IMC);
            startActivity(i);
        }

    }
}








//NA LINHA 22
//Aqui talvez era para ser INTENT também, e ter uma classe JAVA, mas estranhei isso.
// Eu não fiz classe JAVA e suspeito que não precisa).