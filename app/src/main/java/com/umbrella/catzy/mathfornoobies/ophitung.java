package com.umbrella.catzy.mathfornoobies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ophitung extends AppCompatActivity {
    Button btntbh,btnkrg,btnkali,btnbg;
    EditText eangka1,eangka2;
    TextView hasiloh;
    double angka1,angka2,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ophitung);
        btntbh = (Button)findViewById(R.id.btntbh);
        btnkrg = (Button)findViewById(R.id.btnkrg);
        btnkali = (Button)findViewById(R.id.btnkali);
        btnbg = (Button)findViewById(R.id.btnbg);
        eangka1 = (EditText)findViewById(R.id.angka1);
        eangka2 = (EditText)findViewById(R.id.angka2);
        hasiloh = (TextView)findViewById(R.id.hasiloh);

        btntbh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(eangka1.getText().toString().trim())==true){
                    hasiloh.setText("Angka pertama tak boleh kosong");
                }else if(TextUtils.isEmpty(eangka2.getText().toString().trim())==true){
                    hasiloh.setText("Angka kedua tak boleh kosong");
                }else{
                    angka1 = Double.parseDouble(eangka1.getText().toString());
                    angka2 = Double.parseDouble(eangka2.getText().toString());
                    hasil = angka1 + angka2;
                    hasiloh.setText("Hasil Dari "+angka1+"+"+angka2+" = "+hasil);
                }
            }
        });
        btnkrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(eangka1.getText().toString().trim())==true){
                    hasiloh.setText("Angka pertama tak boleh kosong");
                }else if(TextUtils.isEmpty(eangka2.getText().toString().trim())==true){
                    hasiloh.setText("Angka kedua tak boleh kosong");
                }else {
                    angka1 = Double.parseDouble(eangka1.getText().toString());
                    angka2 = Double.parseDouble(eangka2.getText().toString());
                    hasil = angka1 - angka2;
                    hasiloh.setText("Hasil Dari " + angka1 + "-" + angka2 + " = " + hasil);
                }
            }
        });
        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(eangka1.getText().toString().trim())==true){
                    hasiloh.setText("Angka pertama tak boleh kosong");
                }else if(TextUtils.isEmpty(eangka2.getText().toString().trim())==true){
                    hasiloh.setText("Angka kedua tak boleh kosong");
                }else {
                    angka1 = Double.parseDouble(eangka1.getText().toString());
                    angka2 = Double.parseDouble(eangka2.getText().toString());
                    hasil = angka1 * angka2;
                    hasiloh.setText("Hasil Dari " + angka1 + "*" + angka2 + " = " + hasil);
                }
            }
        });
        btnbg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(eangka1.getText().toString().trim())==true){
                    hasiloh.setText("Angka pertama tak boleh kosong");
                }else if(TextUtils.isEmpty(eangka2.getText().toString().trim())==true){
                    hasiloh.setText("Angka kedua tak boleh kosong");
                }else {
                    angka1 = Double.parseDouble(eangka1.getText().toString());
                    angka2 = Double.parseDouble(eangka2.getText().toString());
                    hasil = angka1 / angka2;
                    hasiloh.setText("Hasil Dari " + angka1 + "/" + angka2 + " = " + hasil);
                }
            }
        });
    }
}
