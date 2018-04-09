package com.umbrella.catzy.mathfornoobies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lingkaran extends AppCompatActivity {
    Button htgling;
    EditText ejariling;
    TextView hasiloh;
    double jariling,hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        htgling = (Button)findViewById(R.id.htgling);
        ejariling = (EditText)findViewById(R.id.jariling);
        hasiloh = (TextView)findViewById(R.id.textView12);

        htgling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(ejariling.getText().toString().trim())==true){
                    hasiloh.setText("Jari - Jari tak boleh kosong");
                }else {
                    jariling = Double.parseDouble(ejariling.getText().toString());
                    hasil = 3.141592653589793238462 * jariling * jariling;
                    hasiloh.setText("Luas Lingkaran Adalah : " + hasil + " Satuan Luas");
                }
            }
        });
    }
}
