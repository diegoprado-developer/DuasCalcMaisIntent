package com.example.aluno.trabalhinho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ExibirCadastro extends AppCompatActivity {

    TextView txtDados;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibir_cadastro);

        txtDados = (TextView) findViewById(R.id.txtDados);
        btnVoltar = (Button) findViewById(R.id.btnVoltar);

        Intent intent = getIntent();

        Bundle params = new Bundle();
        params = intent.getExtras();
        if(params != null){

            String nome = getIntent().getStringExtra("NOME");
            String data = getIntent().getStringExtra("NASCIMENTO");
            String telefone = getIntent().getStringExtra("TELEFONE");
            String email = getIntent().getStringExtra("EMAIL");

            txtDados.setText("Nome: "+nome+
                                "\nNascimento: "+data+
                                "\nTelefone: "+telefone+
                                "\nEmail: "+email);
        }

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
