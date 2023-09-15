package com.example.steathsteal;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void IrParaTelaHistoria(View view){
        Intent novaTela = new Intent(MainActivity.this, Historia.class);
        startActivity(novaTela);
    }

    public void IrParaTelaGuia(View view){
        Intent novaTela = new Intent(MainActivity.this, Guia.class);
        startActivity(novaTela);
    }

}