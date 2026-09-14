package com.example.final_intent1;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

Button calcular = findViewById(R.id.calcular);
EditText altura = findViewById(R.id.editTextNumberDecimal1);
EditText peso = findViewById(R.id.editTextNumberDecimal2);



//String alt3 = EditText.getText().toString();    Na linha 43 funciona.

//String alt = Float.valueOf(String.valueOf(altura)).toString();


//INTENT EXPLÍCITA  ----> send,PROCESSAR
// Exemplo
        //Na prática o conceito de intent explicita é usado em Processar.Java
        /*
calcular.setOnClickListener(v ->{
    String alt2 = altura.getText().toString();
    Intent intent = new Intent(this, Processar.class);
    intent.setAction(Intent.ACTION_SEND);
            intent.putExtra("ALTURA", alt2);
            intent.putExtra("PESO",peso.getText().toString());
    intent.setType("decimal/float");
            startActivity(intent);

});
*/

//INTENT IMPLÍCITA
        calcular.setOnClickListener(v -> {
            String textoAltura = altura.getText().toString();
            String textoPeso = peso.getText().toString();

            float altNumerica = Float.parseFloat(altura.getText().toString());
            float pesoNumerico = Float.parseFloat(peso.getText().toString());


            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("decimal/float");
            intent.putExtra("ALTURA", altNumerica);
            intent.putExtra("PESO", pesoNumerico);

            startActivity(intent);
        });

    }
}