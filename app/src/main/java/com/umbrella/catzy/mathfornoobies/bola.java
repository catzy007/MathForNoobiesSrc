package com.umbrella.catzy.mathfornoobies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class bola extends AppCompatActivity {
    Button htgbola;
    EditText ejarib;
    TextView hasiloh;
    double jarib,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bola);
        htgbola = (Button)findViewById(R.id.htgbola);
        ejarib = (EditText)findViewById(R.id.edtjarib);
        hasiloh = (TextView)findViewById(R.id.textview18);

        htgbola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(ejarib.getText().toString().trim())==true){
                    hasiloh.setText("jari - Jari Tak Boleh Kosong");
                }else{
                    jarib = Double.parseDouble(ejarib.getText().toString());
                    hasil = 1.333333333333333333333*3.141592653589793238462*jarib*jarib;
                    hasiloh.setText("Volume Bola Adalah : "+hasil);
                }
            }
        });
    }
}
