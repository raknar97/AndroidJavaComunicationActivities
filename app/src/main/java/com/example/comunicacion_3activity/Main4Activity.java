package com.example.comunicacion_3activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    public final static int CODIGO_ACT3_VUELTA = 500;
    private TextView txt;
    private String recibido, a;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        txt = (TextView) findViewById(R.id.txtFinal);
        recibido=getIntent().getStringExtra("operacion");
        txt.setText(recibido);
    }

    public void vuelta(View v) {
        Intent i = new Intent();
        i.putExtra("resultado",recibido);
        setResult(CODIGO_ACT3_VUELTA, i);
        finish();
    }
}
