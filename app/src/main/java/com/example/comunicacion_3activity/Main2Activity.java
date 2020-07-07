package com.example.comunicacion_3activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private EditText edt;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edt = (EditText) findViewById(R.id.editText);
        txt = (TextView) findViewById(R.id.textView);
    }

    public void pulsar(View view) {
        switch (view.getId()) {
            case R.id.crear:
                txt.setText("Hola Mundo, "+edt.getText());
                break;

            case R.id.limpiar:
                edt.setText("");
                txt.setText("Hola Mundo...");
                break;

        }
    }
}
