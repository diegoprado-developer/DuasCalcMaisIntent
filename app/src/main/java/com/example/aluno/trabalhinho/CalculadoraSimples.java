package com.example.aluno.trabalhinho;

import android.content.DialogInterface;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.ExecutionException;

public class CalculadoraSimples extends AppCompatActivity implements View.OnClickListener{

    Button btnSomar;
    Button btnMultiplicar;
    Button btnSubtrair;
    Button btnDividir;
    Button btnVoltar;

    EditText edtValor1;
    EditText edtValor2;

    TextView txtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_simples);
        inicializarObjetos();

        btnSomar.setOnClickListener(this);
        btnSubtrair.setOnClickListener(this);
        btnDividir.setOnClickListener(this);
        btnMultiplicar.setOnClickListener(this);
        btnVoltar.setOnClickListener(this);
    }

    public void inicializarObjetos(){
        btnSomar = (Button) findViewById(R.id.btnSomar);
        btnSubtrair = (Button) findViewById(R.id.btnSubtrair);
        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        btnDividir = (Button) findViewById(R.id.btnDividir);
        btnVoltar = (Button) findViewById(R.id.btnVoltar);
        edtValor1 = (EditText) findViewById(R.id.edtValor1);
        edtValor2 = (EditText) findViewById(R.id.edtValor2);
        txtResultado = (TextView) findViewById(R.id.txtResultado);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSomar: somar(); break;
            case R.id.btnSubtrair: subtrair(); break;
            case R.id.btnMultiplicar: multiplicar(); break;
            case R.id.btnDividir: divisao(); break;
            case R.id.btnVoltar: finish(); break;
            default: break;
        }
    }

    public void somar(){
        String v1 = edtValor1.getText().toString();
        String v2 = edtValor2.getText().toString();

        if(v1.trim().isEmpty() || v2.trim().isEmpty()){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Error");
            builder.setMessage("Campos em Branco");
            builder.setNeutralButton("OK", null);
            builder.show();
        } else {
            try{
                double resultado = Double.parseDouble(v1) + Double.parseDouble(v2);
                final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Resultado");
                builder.setMessage("Soma: "+ resultado);
                builder.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        builder.setTitle("Limpar");
                        builder.setMessage("Deseja limpar?");
                        builder.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                limparDados();
                            }
                        }).setNegativeButton("NÃO", null);
                        builder.show();
                    }
                });
                builder.show();
            }catch (Exception e){
                e.getMessage();
            }
        }
    }

    public void subtrair(){
        String v1 = edtValor1.getText().toString();
        String v2 = edtValor2.getText().toString();

        if(v1.trim().isEmpty() || v2.trim().isEmpty()){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Error");
            builder.setMessage("Campos em Branco");
            builder.setNeutralButton("OK", null);
            builder.show();
        } else {
            try{
                double resultado = Double.parseDouble(v1) - Double.parseDouble(v2);
                final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Resultado");
                builder.setMessage("Subtração: "+ resultado);
                builder.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        builder.setTitle("Limpar");
                        builder.setMessage("Deseja limpar?");
                        builder.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                limparDados();
                            }
                        }).setNegativeButton("NÃO", null);
                        builder.show();
                    }
                });
                builder.show();
            }catch (Exception e){
                e.getMessage();
            }
        }
    }

    public void multiplicar(){
        String v1 = edtValor1.getText().toString();
        String v2 = edtValor2.getText().toString();

        if(v1.trim().isEmpty() || v2.trim().isEmpty()){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Error");
            builder.setMessage("Campos em Branco");
            builder.setNeutralButton("OK", null);
            builder.show();
        } else {
            try{
                double resultado = Double.parseDouble(v1) * Double.parseDouble(v2);
                final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Resultado");
                builder.setMessage("Multiplicação: "+ resultado);
                builder.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        builder.setTitle("Limpar");
                        builder.setMessage("Deseja limpar?");
                        builder.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                limparDados();
                            }
                        }).setNegativeButton("NÃO", null);
                        builder.show();
                    }
                });
                builder.show();
            }catch (Exception e){
                e.getMessage();
            }
        }
    }

    public void divisao(){
        String v1 = edtValor1.getText().toString();
        String v2 = edtValor2.getText().toString();

        if(v1.trim().isEmpty() || v2.trim().isEmpty()){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Error");
            builder.setMessage("Campos em Branco");
            builder.setNeutralButton("OK", null);
            builder.show();
        } else {
            try{
                double resultado = Double.parseDouble(v1) / Double.parseDouble(v2);
                final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Resultado");
                builder.setMessage("Divisão: "+ resultado);
                builder.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        builder.setTitle("Limpar");
                        builder.setMessage("Deseja limpar?");
                        builder.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                limparDados();
                            }
                        }).setNegativeButton("NÃO", null);
                        builder.show();
                    }
                });
                builder.show();
            }catch (Exception e){
                e.getMessage();
            }
        }
    }

    public void limparDados(){
        edtValor1.setText("");
        edtValor2.setText("");
        txtResultado.setText("");
        edtValor1.requestFocus();
    }
}
