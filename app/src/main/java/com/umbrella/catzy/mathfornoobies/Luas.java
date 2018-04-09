package com.umbrella.catzy.mathfornoobies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Luas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas);
    }
    public void btnpersegi(View view){
        Intent btn1 = new Intent(this, persegi.class);
        startActivity(btn1);
    }
    public void btnpersegip(View view){
        Intent btn2 = new Intent(this, PersegiP.class);
        startActivity(btn2);
    }
    public void btnsegitiga(View view){
        Intent btn3 = new Intent(this, segitiga.class);
        startActivity(btn3);
    }
    public void btnlingkaran(View view){
        Intent btn4 = new Intent(this, Lingkaran.class);
        startActivity(btn4);
    }
}
