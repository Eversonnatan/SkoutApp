package br.com.etecia.skoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editUsuario, editSenha;
    Button btnEntrar, btnSair;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editSenha = findViewById(R.id.edtSenha);
        editUsuario = findViewById(R.id.edtUsuario);
        btnEntrar = findViewById(R.id.btnEntrar);
        btnSair = findViewById(R.id.btnSair);

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // criando variavesi
                String usuario, senha;

                usuario = editUsuario.getText().toString();
                senha = editSenha.getText().toString();

                // valiadando usuario e senha
                if (usuario.equals("etecia") && senha.equals("etecia")) {
                    //abrimos a janela principal
                    startActivity(new Intent(getApplicationContext(),
                            MenuPrincipalActivity.class));
                    finish();


                } else {
                    Toast.makeText(getApplicationContext(), "Usúario ou Senha Invalidos!!!",
                            Toast.LENGTH_SHORT).show();
                }


                Toast.makeText(getApplicationContext(), "Clique aqui!!", Toast.LENGTH_SHORT).show();
                editUsuario.setText("");
                editSenha.setText("");
                editUsuario.requestFocus();


            }
        });

    }
}