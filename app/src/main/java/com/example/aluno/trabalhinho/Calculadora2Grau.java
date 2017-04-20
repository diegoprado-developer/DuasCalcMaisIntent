package com.example.aluno.trabalhinho;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculadora2Grau extends AppCompatActivity {

    EditText edtValor1;
    EditText edtValor2;
    EditText edtValor3;

    TextView txtDelta;
    TextView txtX1;
    TextView txtX2;

    Button btnCalcular;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora2_grau);
        inicializarObjetos();

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String v1 = edtValor1.getText().toString();
                String v2 = edtValor2.getText().toString();
                String v3 = edtValor3.getText().toString();

                if(v1.trim().isEmpty() || v2.trim().isEmpty() || v3.trim().isEmpty()){
                    AlertDialog.Builder builder = new AlertDialog.Builder(getApplication());
                    builder.setTitle("Error");
                    builder.setMessage("Campos em Branco");
                    builder.setNeutralButton("OK", null);
                    builder.show();
                }
            }
        });
    }

    public void inicializarObjetos(){
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnVoltar = (Button) findViewById(R.id.btnVoltar);
        edtValor1 = (EditText) findViewById(R.id.edtValor1);
        edtValor2 = (EditText) findViewById(R.id.edtValor2);
        edtValor3 = (EditText) findViewById(R.id.edtValor3);
        txtDelta = (TextView) findViewById(R.id.txtResultDelta);
        txtX1 = (TextView) findViewById(R.id.txtResultX1);
        txtX2 = (TextView) findViewById(R.id.txtResultX2);
    }
}
