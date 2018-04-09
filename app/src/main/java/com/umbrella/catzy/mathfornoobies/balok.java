package com.umbrella.catzy.mathfornoobies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class balok extends AppCompatActivity {
    Button htgbalok;
    EditText epanjangb,elebarb,etinggib;
    TextView hasiloh;
    double panjangb,lebarb,tinggib,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);
        htgbalok = (Button)findViewById(R.id.htgbalok);
        epanjangb = (EditText)findViewById(R.id.edtpjgb);
        elebarb = (EditText)findViewById(R.id.edtlbrb);
        etinggib = (EditText)findViewById(R.id.edttggb);
        hasiloh = (TextView)findViewById(R.id.textview16);

        htgbalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(epanjangb.getText().toString().trim())==true){
                    hasiloh.setText("Panjang Balok tak boleh kosong");
                }else if(TextUtils.isEmpty(elebarb.getText().toString().trim())==true){
                    hasiloh.setText("Lebar Balok tak boleh kosong");
                }else if(TextUtils.isEmpty(etinggib.getText().toString().trim())==true){
                    hasiloh.setText("Tinggi Balok Tak Boleh Kosong");
                }else{
                    panjangb = Double.parseDouble(epanjangb.getText().toString());
                    lebarb = Double.parseDouble(elebarb.getText().toString());
                    tinggib = Double.parseDouble(etinggib.getText().toString());
                    hasil = panjangb*lebarb*tinggib;
                    hasiloh.setText("Volume Balok Adalah = "+hasil);
                }
            }
        });
    }
}
