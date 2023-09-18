package com.example.steathsteal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class controle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controle);
    }

    public void IrParaTelaAnterior(View view){
        Intent novaTela = new Intent(controle.this, Guia.class);
        startActivity(novaTela);
    }

}