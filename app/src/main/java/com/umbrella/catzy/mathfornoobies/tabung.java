package com.umbrella.catzy.mathfornoobies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class tabung extends AppCompatActivity {
    Button htgtabung;
    EditText ejaritt,etinggitt;
    TextView hasiloh;
    double jarit,tinggit,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);
        htgtabung = (Button)findViewById(R.id.htgtabung);
        ejaritt = (EditText)findViewById(R.id.edtjaritt);
        etinggitt = (EditText)findViewById(R.id.edttggtt);
        hasiloh = (TextView)findViewById(R.id.textview20);

        htgtabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(ejaritt.getText().toString().trim())==true){
                    hasiloh.setText("Jari - Jari tak boleh kosong");
                }else if(TextUtils.isEmpty(etinggitt.getText().toString().trim())==true){
                    hasiloh.setText("Tinggi tak boleh kosong");
                }else {
                    jarit=Double.parseDouble(ejaritt.getText().toString());
                    tinggit=Double.parseDouble(etinggitt.getText().toString());
                    hasil=3.141592653589793238462*jarit*jarit*tinggit;
                    hasiloh.setText("Volume Tabung Adalah : "+hasil);
                }
            }
        });
    }
}
