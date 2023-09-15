package com.example.steathsteal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class niveis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niveis);
    }

    public void IrParaTelaFase1(View view) {
        Intent novaTela = new Intent(niveis.this, fase1.class);
        startActivity(novaTela);
    }

    public void IrParaTelaFase2(View view) {
        Intent novaTela = new Intent(niveis.this, fase2.class);
        startActivity(novaTela);
    }

    public void IrParaTelaFase3(View view) {
        Intent novaTela = new Intent(niveis.this, fase3.class);
        startActivity(novaTela);
    }

    public void IrParaTelaAnterior(View view) {
        Intent novaTela = new Intent(niveis.this, Guia.class);
        startActivity(novaTela);
    }
}