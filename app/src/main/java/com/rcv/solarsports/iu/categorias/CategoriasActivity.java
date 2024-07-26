package com.rcv.solarsports.iu.categorias;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.rcv.solarsports.R;
import com.rcv.solarsports.iu.estadios.RegistrarEstadioActivity;

public class CategoriasActivity extends AppCompatActivity {
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);

        spinner = findViewById(R.id.spinner_registrar_categorias);

        String[] elementos = {"Escoja la categoría", "Estadio", "Parque", "Gimnacio", "Pista"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, elementos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View view, int position, long id) {
                String elementoSeleccionado = (String) parentView.getItemAtPosition(position);
                Toast.makeText(CategoriasActivity.this, "Seleciono: " + elementoSeleccionado, Toast.LENGTH_SHORT).show();

                switch (elementoSeleccionado) {
                    case "Estadio":
                        Intent intent = new Intent(getApplicationContext(), RegistrarEstadioActivity.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),"Puedes registrar tu estadio", Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Acción a realizar cuando no se selecciona ningún elemento

            }
        });


    }
}