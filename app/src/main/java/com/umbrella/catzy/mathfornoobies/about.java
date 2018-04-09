package com.umbrella.catzy.mathfornoobies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        WebView view = (WebView) findViewById(R.id.webviewabout);
        String text;
        text = "<html><body><p align=\"justify\">";
        text+= "Math for noobies adalah program yang diciptakan untuk membantu menyelesaikan masalah perhitungan sederhana, " +
                "dialamnya ada kalkulator, penghitung luas dan penghitung volume.";
        text+= "</p></body></html>";
        view.loadData(text, "text/html", "utf-8");
    }
}
