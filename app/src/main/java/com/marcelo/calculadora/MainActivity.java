package com.marcelo.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText val1, val2;
    Button btnSumar, btnRestar, btnMultiplicar, btnDividir;

    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val1 = findViewById(R.id.primerValor);
        val2 = findViewById(R.id.segundoValor);
        btnSumar= findViewById(R.id.btn_sumar);
        btnRestar= findViewById(R.id.btn_restar);
        btnMultiplicar= findViewById(R.id.btn_multiplicar2);
        btnDividir= findViewById(R.id.btn_dividir);
        resultado= findViewById(R.id.resultado);
    }

    public void sumar(View view){
        String primerValor = val1.getText().toString();
        String segundoValor = val2.getText().toString();
        double v1 = Double.parseDouble(primerValor);
        double v2 = Double.parseDouble(segundoValor);

        resultado.setText(""+(v1+v2));

    }
    public void restar(View view){
        String primerValor = val1.getText().toString();
        String segundoValor = val2.getText().toString();
        double v1 = Double.parseDouble(primerValor);
        double v2 = Double.parseDouble(segundoValor);

        resultado.setText(""+(v1-v2));

    }
    public void multiplicar(View view){
        String primerValor = val1.getText().toString();
        String segundoValor = val2.getText().toString();
        double v1 = Double.parseDouble(primerValor);
        double v2 = Double.parseDouble(segundoValor);

        resultado.setText(""+(v1*v2));

    }
    public void dividir(View view){
        String primerValor = val1.getText().toString();
        String segundoValor = val2.getText().toString();
        double v1 = Double.parseDouble(primerValor);
        double v2 = Double.parseDouble(segundoValor);

        resultado.setText(""+(v1/v2));

    }
    public void resetear(View view){
        val1.setText(null);
        val2.setText(null);
        resultado.setText(null);
    }
}
