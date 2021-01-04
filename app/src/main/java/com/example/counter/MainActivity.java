package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t=findViewById(R.id.result);
    }
    public void add(View v)
    {
        int a=Integer.parseInt(t.getText().toString());
        a=a+1;
        t.setText(Integer.toString(a));
    }
    public void subtract(View v)
    {
        int a=Integer.parseInt(t.getText().toString());
        a=Math.max(0,a-1);
        t.setText(Integer.toString(a));
    }
    public void clear(View v)
    {
        t.setText("0");
    }
}
