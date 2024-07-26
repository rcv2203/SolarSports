package com.rcv.solarsports.iu.ingresos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.rcv.solarsports.R;

public class RegisterActivity extends AppCompatActivity {

    Button button_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);;
        setContentView(R.layout.activity_register);

        button_register = findViewById(R.id.btn_registrado);
        button_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_register = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent_register);
                Toast.makeText(getApplicationContext(),"Estas en iniciar sesión", Toast.LENGTH_SHORT).show();
            }
        });

    }
}