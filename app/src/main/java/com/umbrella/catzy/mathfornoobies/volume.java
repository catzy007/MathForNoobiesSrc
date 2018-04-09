package com.umbrella.catzy.mathfornoobies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class volume extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);
    }
    public void btnkubus(View view){
        Intent btn1 = new Intent(this, Kubus.class);
        startActivity(btn1);
    }
    public void btnbalok(View view){
        Intent btn2 = new Intent(this, balok.class);
        startActivity(btn2);
    }
    public void btnbola(View view){
        Intent btn3 = new Intent(this, bola.class);
        startActivity(btn3);
    }
    public void btntabung(View view){
        Intent btn4 = new Intent(this, tabung.class);
        startActivity(btn4);
    }
}
