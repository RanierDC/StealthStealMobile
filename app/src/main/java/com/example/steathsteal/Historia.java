package com.example.steathsteal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Historia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia);
    }

    public void IrParaTelaMenu(View view) {
        Intent novaTela = new Intent(Historia.this, MainActivity.class);
        startActivity(novaTela);
    }
}