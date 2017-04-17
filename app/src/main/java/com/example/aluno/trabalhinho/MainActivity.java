package com.example.aluno.trabalhinho;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listOpcoes);
        carregarLista();
    }

    public void carregarLista(){
        List<String> menu = new ArrayList<String>();

        menu.add("Calculadora Simples");
        menu.add("Calculadora 2ºGrau");
        menu.add("Cadastro");
        menu.add("Sair");

        ArrayAdapter arrayMenu = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu);

        listView.setAdapter(arrayMenu);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //int menu = (int) listView.getItemAtPosition(position);
                // Chamada das activity
                switch (position){
                    case 0:
                        Intent calculadoraSimples = new Intent(MainActivity.this, CalculadoraSimples.class);
                        startActivity(calculadoraSimples);
                        break;
                    case 1:
                        Intent calculadora2Grau = new Intent(MainActivity.this, Calculadora2Grau.class);
                        startActivity(calculadora2Grau);
                        break;
                    case 2:
                        Intent cadastro = new Intent(MainActivity.this, Cadastro.class);
                        startActivity(cadastro);
                        break;
                    case 3:
                        finish();
                        break;
                }


            }
        });
    }
}
