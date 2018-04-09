package com.umbrella.catzy.mathfornoobies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kubus extends AppCompatActivity {
    Button htgkubus;
    EditText esisi;
    TextView hasiloh;
    double sisi,hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);
        htgkubus = (Button)findViewById(R.id.htgkubus);
        esisi = (EditText)findViewById(R.id.edtsisik);
        hasiloh = (TextView)findViewById(R.id.textview14);

        htgkubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(esisi.getText().toString().trim())==true){
                    hasiloh.setText("Sisi Kubus Tidak Boleh Kosong");
                }else{
                    sisi = Double.parseDouble(esisi.getText().toString());
                    hasil = sisi*sisi*sisi;
                    hasiloh.setText("Volume Kubus Adalah : "+hasil);
                }
            }
        });
    }
}
