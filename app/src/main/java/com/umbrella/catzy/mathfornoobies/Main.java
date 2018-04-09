package com.umbrella.catzy.mathfornoobies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button1(View view){
        Intent btn1 = new Intent(this, ophitung.class);
        startActivity(btn1);
    }
    public void button2(View view){
        Intent btn2 = new Intent(this, Luas.class);
        startActivity(btn2);
    }
    public void button3(View view){
        Intent btn3 = new Intent(this, volume.class);
        startActivity(btn3);
    }
    public void button4(View view){
        Intent btn4 = new Intent(this, about.class);
        startActivity(btn4);
    }
}
