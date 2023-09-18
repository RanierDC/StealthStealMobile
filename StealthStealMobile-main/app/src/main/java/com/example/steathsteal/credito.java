package com.example.steathsteal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class credito extends AppCompatActivity {

    Button BtnPer1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credito);

        BtnPer1 = (Button) findViewById(R.id.BtnPer1);
    }

    private void vibrar() {

        Vibrator rr = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        long milisegundos = 100;
        rr.vibrate(milisegundos);

    }


    public void irParaSitePerfilRanier(View view) {
        Uri uri = Uri.parse("https://github.com/RanierDC");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);

        vibrar();

    }

    public void irParaSitePerfilCaio(View view) {
        Uri uri = Uri.parse("https://github.com/caioolsilva");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);

        vibrar();

    }

    public void IrParaTelaMenu(View view) {
        Intent novaTela = new Intent(credito.this, MainActivity.class);
        startActivity(novaTela);
    }


}