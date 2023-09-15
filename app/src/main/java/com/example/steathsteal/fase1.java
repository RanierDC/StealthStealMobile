package com.example.steathsteal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fase1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fase1);
    }

    public void IrParaTelaFases(View view){
        Intent novaTela = new Intent(fase1.this, niveis.class);
        startActivity(novaTela);
    }
}