package com.example.final_intent1;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.core.view.WindowInsetsCompat;
public class Saudavel extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saudavel);
    }

    Button voltarSaudavel = findViewById(R.id.voltarSaudavel);

    void Homepage() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}
