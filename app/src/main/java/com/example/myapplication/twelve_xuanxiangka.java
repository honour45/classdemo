package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TabHost;

public class twelve_xuanxiangka extends AppCompatActivity {
private TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelve_xuanxiangka);
        tabHost=(TabHost)findViewById(android.R.id.tabhost);
        tabHost.setup();
        LayoutInflater inflater=LayoutInflater.from(this);
        inflater.inflate(R.layout.tab1,tabHost.getTabContentView());
        inflater.inflate(R.layout.tab2,tabHost.getTabContentView());
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("精选表情").setContent(R.id.left));
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("表情").setContent(R.id.right));

    }
}