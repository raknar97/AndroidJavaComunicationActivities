package com.example.comunicacion_3activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    private EditText edt1, edt2;
    private String aux = "";
    private int ID_PARAMETRO = 101, COD_VUELTA = 404;
    private double n1,n2,n3;
    private Button btn;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        edt1 = (EditText) findViewById(R.id.edt2);
        edt2 = (EditText) findViewById(R.id.edt3);
        btn = (Button) findViewById(R.id.btnNext);
        spinner=(Spinner)findViewById(R.id.spinner);
        String []opciones={"Sumar","Restar","Multiplicar","Dividir"};
        ArrayAdapter <String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,opciones);
        spinner.setAdapter(adapter);


    }

    public void Calcular(View view) {
        Intent i = new Intent(getApplicationContext(), Main4Activity.class);
        String seleccion=spinner.getSelectedItem().toString();

        //primera forma de Char a int/double
        aux = edt1.getText().toString();
        n1 = Double.parseDouble(aux);


        //segunda forma de char a int
        n2 = Double.parseDouble(edt2.getText().toString());

        switch (seleccion){
            case "Sumar":
                n3 = n1 + n2;
                break;

            case "Restar":
                n3 = n1 - n2;
                break;
            case "Multiplicar":
                n3 = n1 * n2;
                break;
            case "Dividir":
                n3 = n1 / n2;
                break;
        }



        aux = String.valueOf(n3);
        i.putExtra("operacion", aux);
        if (i != null) {
            startActivityForResult(i, ID_PARAMETRO);
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == ID_PARAMETRO && resultCode == Main4Activity.CODIGO_ACT3_VUELTA) {
            setResult(COD_VUELTA, data);
            finish();
        }
    }
}
