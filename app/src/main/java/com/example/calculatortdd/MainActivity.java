package com.example.calculatortdd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Calculator calculator = new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((TextView)findViewById(R.id.display)).setText(calculator.display);

        findViewById(R.id.but1).setOnClickListener(e -> press("1"));
        findViewById(R.id.but2).setOnClickListener(e -> press("2"));
        findViewById(R.id.but3).setOnClickListener(e -> press("3"));
        findViewById(R.id.but4).setOnClickListener(e -> press("4"));
        findViewById(R.id.but5).setOnClickListener(e -> press("5"));
        findViewById(R.id.but6).setOnClickListener(e -> press("6"));
        findViewById(R.id.but7).setOnClickListener(e -> press("7"));
        findViewById(R.id.but8).setOnClickListener(e -> press("8"));
        findViewById(R.id.but9).setOnClickListener(e -> press("9"));
        findViewById(R.id.butmult).setOnClickListener(e -> press("*"));
        findViewById(R.id.butminus).setOnClickListener(e -> press("-"));
        findViewById(R.id.butdivide).setOnClickListener(e -> press("/"));
        findViewById(R.id.butadd).setOnClickListener(e -> press("+"));
        findViewById(R.id.butequals).setOnClickListener(e -> press("="));
        findViewById(R.id.butclear).setOnClickListener(e -> press("c"));



    }
    void press(String s) {
        calculator.press(s);
        ((TextView)findViewById(R.id.display)).setText(calculator.display);
    }
}