package com.vilcapoma.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class CalculadoraActivity extends AppCompatActivity {

    EditText teoria1;
    EditText teoria2;
    TextView promedioTeoria;
    EditText practica1;
    EditText practica2;
    EditText practica3;
    EditText practica4;
    TextView promedioLaboratorio;
    Spinner calificaciones;
    TextView finalizar;
    Button calcular;

    private String aprobado="Aprobado!";
    private String desaprobado="Desaprobado!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        teoria1=findViewById(R.id.EtTeoria1);
        teoria2=findViewById(R.id.EtTeoria2);
        promedioTeoria=findViewById(R.id.TvPromedioTeoria);
        promedioLaboratorio=findViewById(R.id.TvPromedioLaboratorio);
        calificaciones = findViewById(R.id.Spinner1);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,
                R.array.calificaciones,android.R.layout.simple_spinner_item);

        calificaciones.setAdapter(adapter);
    }

    public void calcular(View view){
        String Practica1 = teoria1.getText().toString();
        String Practica2=teoria2.getText().toString();

    }
}
