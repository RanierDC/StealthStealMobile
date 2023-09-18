package com.example.steathsteal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class Guia extends AppCompatActivity {

    Button BtnLevels;
    Button BtnOpn;
    Button BtnTuto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guia);

        BtnLevels = (Button) findViewById(R.id.BtnLevels);
        BtnOpn = (Button) findViewById(R.id.BtnOpn);
        BtnTuto = (Button) findViewById(R.id.BtnTuto);
    }

    private void vibrar(){

        Vibrator rr = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        long milisegundos = 100;
        rr.vibrate(milisegundos);

    }

    public void IrParaTelaMenu(View view){
        Intent novaTela = new Intent(Guia.this, MainActivity.class);
        startActivity(novaTela);
    }

    public void IrParaTelaFases(View view){
        Intent novaTela = new Intent(Guia.this, niveis.class);
        startActivity(novaTela);

        vibrar();
    }

    public void IrParaTelaTutorial(View view){
        Intent novaTela = new Intent(Guia.this, Tutorial.class);
        startActivity(novaTela);

        vibrar();
    }

    public void IrParaTelaOpcoes(View view){
        Intent novaTela = new Intent(Guia.this, Opcoes.class);
        startActivity(novaTela);

        vibrar();
    }


}