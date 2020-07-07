package com.example.comunicacion_3activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final int CODIGO_IDA = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pulsar(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.button:
                i = new Intent(this, Main2Activity.class);
                startActivity(i);
                break;
            case R.id.button2:
                i=new Intent(getApplicationContext(),Main3Activity.class);
                startActivityForResult(i,CODIGO_IDA);
                break;

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Toast.makeText(getApplicationContext(),data.getStringExtra("resultado"),Toast.LENGTH_LONG).show();
    }
}
