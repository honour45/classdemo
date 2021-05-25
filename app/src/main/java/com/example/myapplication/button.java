package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class button extends AppCompatActivity {
    EditText editText1,editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        Button bt=(findViewById(R.id.button_bt));
        editText1=(findViewById(R.id.button_et1));
        editText2=(findViewById(R.id.button_et2));
        TextView textView1=(findViewById(R.id.button_tt));



        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(button.this,zhu_ce.class));

            }
        });
    }

    public void myClick(View view){
        SharedPreferences pref = getSharedPreferences("data", MODE_PRIVATE);
        String name = pref.getString("name", "");
        String mima = pref.getString("mima", "");
        if (editText1.length()!=0 && editText2.length()!=0){
            if (editText1.getText().toString().trim().equals(name) && editText2.getText().toString().trim().equals(mima) ==true){
                startActivity(new Intent(button.this,button_dati.class));
                finish();
            }else {
                Toast.makeText(button.this,"账号或密码错误",Toast.LENGTH_SHORT).show();
            }
        }else {
            Toast.makeText(button.this,"有未输入内容",Toast.LENGTH_SHORT).show();

        }


//        startActivity(new Intent(button.this,zhuye.class));
    }


}