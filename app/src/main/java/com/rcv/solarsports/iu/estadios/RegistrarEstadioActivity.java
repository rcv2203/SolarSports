package com.rcv.solarsports.iu.estadios;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.rcv.solarsports.R;

import java.util.Calendar;
import java.util.Date;

public class RegistrarEstadioActivity extends AppCompatActivity {

    private TextView dateTextView;
    ImageView calendarImage;
    Button btn_registrarEstadio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_estadio);

        dateTextView = findViewById(R.id.date_text_view);
        calendarImage = findViewById(R.id.calendar_image);
        btn_registrarEstadio = findViewById(R.id.btn_enviarDatos);

        btn_registrarEstadio.setOnClickListener(v -> enviarDatosEstadio());
        calendarImage.setOnClickListener(v -> showDatePickerDialog());

    }

    private void enviarDatosEstadio() {
        Intent intentDatosEstadio = new Intent(getApplicationContext(), EstadisticasEstadioActivity.class);
        startActivity(intentDatosEstadio);
    }


    private void showDatePickerDialog() {
        final Calendar calendario = Calendar.getInstance();
        int year = calendario.get(Calendar.YEAR);
        int month = calendario.get(Calendar.MONTH);
        int day = calendario.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                (view, selectedYear, selectedMonth, selectedDay) -> {
                    String selectedDate = selectedDay + "/" + (selectedMonth + 1) + "/" + selectedYear;
                    dateTextView.setText(selectedDate);
                },
                year, month, day);
           datePickerDialog.show();

    }
}