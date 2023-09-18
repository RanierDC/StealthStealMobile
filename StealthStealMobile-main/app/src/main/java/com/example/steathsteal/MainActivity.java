package com.example.steathsteal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Vibrator;
import android.view.View;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button BtnPro;
    Button BtnHis;
    Button BtnGuia;
    Button BtnCredito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnPro = (Button) findViewById(R.id.BtnPro);
        BtnHis = (Button) findViewById(R.id.BtnHist);
        BtnGuia = (Button) findViewById(R.id.BtnGuia);
        BtnCredito = (Button) findViewById(R.id.BtnCredito);


    }

    private void vibrar(){

        Vibrator rr = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        long milisegundos = 100;
        rr.vibrate(milisegundos);

    }

    public void IrParaTelaHistoria(View view) {
        Intent novaTela = new Intent(MainActivity.this, Historia.class);
        startActivity(novaTela);

        vibrar();
    }

    public void IrParaTelaGuia(View view) {
        Intent novaTela = new Intent(MainActivity.this, Guia.class);
        startActivity(novaTela);

        vibrar();
    }

    public void irParaSiteProjeto(View view) {
        Uri uri = Uri.parse("https://github.com/RanierDC/StealthStealMobile");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);

        vibrar();

    }


    public void IrParaTelaCredito(View view) {
        Intent novaTela = new Intent(MainActivity.this, credito.class);
        startActivity(novaTela);

        vibrar();
    }

}