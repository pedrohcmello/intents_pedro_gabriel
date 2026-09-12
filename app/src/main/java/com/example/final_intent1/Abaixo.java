package com.example.final_intent1;

import android.os.Bundle;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
public class Abaixo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abaixo);
    }


    //NÃO SEI SE ESTÁ CORRETA ESSA LÓGICA
    Button voltarAbaixo = findViewById(R.id.voltarAbaixo);
    void Homepage() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}
