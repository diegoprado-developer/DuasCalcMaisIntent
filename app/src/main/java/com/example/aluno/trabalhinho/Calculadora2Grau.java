package com.example.aluno.trabalhinho;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculadora2Grau extends AppCompatActivity {

    EditText edtValor1;
    EditText edtValor2;
    EditText edtValor3;

    TextView txtDelta;
    TextView txtX1;
    TextView txtX2;

    Button btnCalcular;
    Button btnVoltar;

    double delta, valor1, valor2, valor3,x1,x2;

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
                }else{
                    valor1 = Double.parseDouble(v1);
                    valor2 = Double.parseDouble(v2);
                    valor3 = Double.parseDouble(v3);

                    delta = ((valor2*valor2)-(4*valor1*valor3));

                    if(delta >= 0){
                        x1 = ((-valor2 + (Math.sqrt (delta))) / (2*valor1));
                        x2 = ((-valor2 - (Math.sqrt (delta))) / (2*valor1));

                        txtDelta.setText(String.valueOf(delta));
                        txtX1.setText(String.valueOf(x1));
                        txtX2.setText(String.valueOf(x2));
                    }else{
                        Toast.makeText(v.getContext(), "Delta Invalido", Toast.LENGTH_SHORT).show();
                    }
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
