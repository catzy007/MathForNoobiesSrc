package com.umbrella.catzy.mathfornoobies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class segitiga extends AppCompatActivity {
    Button htgsegitiga;
    EditText ealass,etinggis;
    TextView hasiloh;
    double alas,tinggi,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        htgsegitiga = (Button)findViewById(R.id.htgsegitiga);
        ealass = (EditText)findViewById(R.id.alass);
        etinggis = (EditText)findViewById(R.id.tinggis);
        hasiloh = (TextView)findViewById(R.id.textView8);

        htgsegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(ealass.getText().toString().trim())==true){
                    hasiloh.setText("Alas tak boleh kosong");
                }else if(TextUtils.isEmpty(etinggis.getText().toString().trim())==true){
                    hasiloh.setText("Tinggi tak boleh kosong");
                }else {
                    alas = Double.parseDouble(ealass.getText().toString());
                    tinggi = Double.parseDouble(etinggis.getText().toString());
                    hasil = (alas * tinggi) / 2;
                    hasiloh.setText("Luas Segitiga Adalah : " + hasil + " Satuan luas");
                }
            }
        });
    }
}
