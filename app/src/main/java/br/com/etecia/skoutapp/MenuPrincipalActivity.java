package br.com.etecia.skoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MenuPrincipalActivity extends AppCompatActivity {
    Button btnVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        btnVoltar = findViewById(R.id.btnVoltar);

                super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal_layout);

        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        finish();

    }
}