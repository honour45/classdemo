package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class deno_str extends AppCompatActivity {
    LinearLayout linearLayout,linearLayout1;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deno_str);
        linearLayout=(LinearLayout)findViewById(R.id.ll);
        linearLayout1=new LinearLayout(deno_str.this);
        linearLayout1.setOrientation(LinearLayout.VERTICAL);
        scrollView=new ScrollView(deno_str.this);
        linearLayout.addView(scrollView);
        scrollView.addView(linearLayout1);
        ImageView imageView=new ImageView(deno_str.this);
        imageView.setImageResource(R.drawable.faxian);
        TextView textView=new TextView(deno_str.this);
        textView.setTextSize(20);
        textView.setText(R.string.aaa);
        linearLayout1.addView(imageView);
        linearLayout1.addView(textView);
    }
}