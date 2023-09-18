package com.example.steathsteal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fase2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fase2);
    }

    public void IrParaTelaFases(View view){
        Intent novaTela = new Intent(fase2.this, niveis.class);
        startActivity(novaTela);
    }

}