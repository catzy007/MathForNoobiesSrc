package com.umbrella.catzy.mathfornoobies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class persegi extends AppCompatActivity {
    Button btnhitung;
    EditText esisi;
    TextView hasiloh;
    double sisi,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
        btnhitung = (Button)findViewById(R.id.htgpersegi);
        esisi = (EditText)findViewById(R.id.sisipersegi);
        hasiloh = (TextView)findViewById(R.id.textView6);

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(esisi.getText().toString().trim())==true){
                    hasiloh.setText("Sisi tak boleh kosong");
                }else {
                    sisi = Double.parseDouble(esisi.getText().toString());
                    hasil = sisi * sisi;
                    hasiloh.setText("Luas Persegi Adalah : " + hasil + " Satuan luas");
                }
            }
        });
    }

}
