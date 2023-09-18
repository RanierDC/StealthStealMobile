package com.example.steathsteal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class niveis extends AppCompatActivity {

    Button BtnFas1;
    Button BtnFas2;
    Button BtnFas3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niveis);

        BtnFas1 = (Button) findViewById(R.id.BtnFas1);
        BtnFas2 = (Button) findViewById(R.id.BtnFas2);
        BtnFas3 = (Button) findViewById(R.id.BtnFas3);


    }

    private void vibrar(){

        Vibrator rr = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        long milisegundos = 100;
        rr.vibrate(milisegundos);

    }

    public void IrParaTelaFase1(View view) {
        Intent novaTela = new Intent(niveis.this, fase1.class);
        startActivity(novaTela);

        vibrar();
    }

    public void IrParaTelaFase2(View view) {
        Intent novaTela = new Intent(niveis.this, fase2.class);
        startActivity(novaTela);

        vibrar();
    }

    public void IrParaTelaFase3(View view) {
        Intent novaTela = new Intent(niveis.this, fase3.class);
        startActivity(novaTela);

        vibrar();
    }

    public void IrParaTelaAnterior(View view) {
        Intent novaTela = new Intent(niveis.this, Guia.class);
        startActivity(novaTela);
    }
}