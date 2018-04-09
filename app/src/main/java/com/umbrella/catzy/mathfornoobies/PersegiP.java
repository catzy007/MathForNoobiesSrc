package com.umbrella.catzy.mathfornoobies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiP extends AppCompatActivity {
    Button htgpersegip;
    EditText ealasp,etinggip;
    TextView hasiloh;
    double alas,tinggi,hasiil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_p);
        htgpersegip = (Button)findViewById(R.id.htgpersegip);
        ealasp = (EditText)findViewById(R.id.alasp);
        etinggip = (EditText)findViewById(R.id.tinggip);
        hasiloh = (TextView)findViewById(R.id.textView10);

        htgpersegip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(ealasp.getText().toString().trim())==true){
                    hasiloh.setText("Alas tak boleh kosong");
                }else if(TextUtils.isEmpty(etinggip.getText().toString().trim())==true){
                    hasiloh.setText("Tinggi tak boleh kosong");
                }else {
                    alas = Double.parseDouble(ealasp.getText().toString());
                    tinggi = Double.parseDouble(etinggip.getText().toString());
                    hasiil = alas * tinggi;
                    hasiloh.setText("Luas Persegi Panjang Adalah : " + hasiil + " Satuan luas");
                }
            }
        });

    }
}
