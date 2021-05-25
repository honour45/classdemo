package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class list_demo extends AppCompatActivity {
private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_demo);
        spinner=findViewById(R.id.list1_spinner);


        //法1  适配器
        String[] str=new String[]{"all","art","musican","physical","movie"};
        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this,R.layout.activity_list_demo,str);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter1);
        String s=spinner.getSelectedItem().toString();


        //法2   监听器
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {//选中  i 第几个item
                String result=adapterView.getItemAtPosition(i).toString();
                Toast.makeText(list_demo.this,result,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}