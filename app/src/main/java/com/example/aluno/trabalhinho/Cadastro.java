package com.example.aluno.trabalhinho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cadastro extends AppCompatActivity {

    EditText edtNome;
    EditText edtNascimento;
    EditText edtTelefone;
    EditText edtEmail;

    Button btnVoltar;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        inicializa();

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = edtNome.getText().toString();
                String nasc = edtNascimento.getText().toString();
                String tel = edtTelefone.getText().toString();
                String email = edtEmail.getText().toString();
                if (nome.trim().isEmpty() || nasc.trim().isEmpty() || tel.trim().isEmpty() || email.trim().isEmpty()) {
                    Toast.makeText(v.getContext(), "Campos em branco", Toast.LENGTH_SHORT).show();

                } else {
                    Intent intent = new Intent(v.getContext(), ExibirCadastro.class);
                    intent.putExtra("NOME", edtNome.getText().toString());
                    intent.putExtra("NASCIMENTO", edtNascimento.getText().toString());
                    intent.putExtra("TELEFONE", edtTelefone.getText().toString());
                    intent.putExtra("EMAIL", edtEmail.getText().toString());
                    startActivity(intent);

                }
            }
        });


        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    public void inicializa() {
        edtNome = (EditText) findViewById(R.id.edtNome);
        edtNascimento = (EditText) findViewById(R.id.edtData);
        edtTelefone = (EditText) findViewById(R.id.edtTelefone);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        btnEnviar = (Button) findViewById(R.id.btnEnviar);
        btnVoltar = (Button) findViewById(R.id.btnVoltar);
    }
}
