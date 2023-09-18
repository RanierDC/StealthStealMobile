package com.example.steathsteal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Opcoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcoes);
    }

    public void IrParaTelaGuia(View view){
        Intent novaTela = new Intent(Opcoes.this, Guia.class);
        startActivity(novaTela);
    }
}