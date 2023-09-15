package com.example.steathsteal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Guia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guia);
    }

    public void IrParaTelaMenu(View view){
        Intent novaTela = new Intent(Guia.this, MainActivity.class);
        startActivity(novaTela);
    }

    public void IrParaTelaFases(View view){
        Intent novaTela = new Intent(Guia.this, niveis.class);
        startActivity(novaTela);
    }

    public void IrParaTelaTutorial(View view){
        Intent novaTela = new Intent(Guia.this, Tutorial.class);
        startActivity(novaTela);
    }

    public void IrParaTelaOpcoes(View view){
        Intent novaTela = new Intent(Guia.this, Opcoes.class);
        startActivity(novaTela);
    }


}