package com.rcv.solarsports.iu.ingresos;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.rcv.solarsports.MenuActivity;
import com.rcv.solarsports.R;

public class LoginActivity extends AppCompatActivity {

    Button btn_menu;
    ImageView btn_in, btn_google, btn_facebock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_menu = findViewById(R.id.btn_menu);
        btn_in = findViewById(R.id.btn_in);
        btn_google = findViewById(R.id.btn_google);
        btn_facebock = findViewById(R.id.btn_faceboock);

        btn_facebock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://es-la.facebook.com/reg/";
                Uri uri = Uri.parse(url);
                Intent intentBtnFaceboock = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intentBtnFaceboock);
            }
        });

        btn_google.setOnClickListener(v -> {
            String url = "https://accounts.google.com/InteractiveLogin/signinchooser?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&osid=1&passive=1209600&service=mail&ifkv=AdF4I766L4YYkDsmSk-xsrgGwjQeha0nS2wdSr-bP8n28nS0tGrm9vRgYIOC0xu2jfhzpWGM6QSfnw&ddm=0&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
            Uri uri = Uri.parse(url);
            Intent intentBtnGoogle = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intentBtnGoogle);
        });

        btn_in.setOnClickListener(v -> {
            String url = "https://www.linkedin.com/signup?_l=es";
            Uri uri = Uri.parse(url);
            Intent intentBtnIn = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intentBtnIn);
        });







        btn_menu.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(),"Estas el menú", Toast.LENGTH_SHORT).show();
        });


    }


}