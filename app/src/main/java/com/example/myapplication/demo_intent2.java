package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class demo_intent2 extends AppCompatActivity {
private TextView name,phone,site;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_intent2);
        name=findViewById(R.id.name);
        phone=findViewById(R.id.phone);
        site=findViewById(R.id.site);

        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        name.setText(bundle.getString("name"));
        phone.setText(bundle.getString("phone"));
        site.setText(bundle.getString("site1")+bundle.getString("site2")+bundle.getString("site3"));

    }
}