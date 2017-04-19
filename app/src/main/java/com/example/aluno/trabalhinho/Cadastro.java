package com.example.aluno.trabalhinho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

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
    }

    public void inicializa(){
        edtNome = (EditText) findViewById(R.id.edtNome);
        edtNome = (EditText) findViewById(R.id.edtData);
        edtNome = (EditText) findViewById(R.id.edtTelefone);
        edtNome = (EditText) findViewById(R.id.edtEmail);
        btnEnviar = (Button) findViewById(R.id.btnEnviar);
        btnVoltar = (Button) findViewById(R.id.btnVoltar);
    }
}
