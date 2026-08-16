package com.example.forexaiscalper;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("Forex AI Scalper");
        textView.setTextSize(24);
        textView.setPadding(30, 50, 30, 30);

        setContentView(textView);
    }
}
