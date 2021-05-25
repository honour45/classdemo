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

public class zhu_ce extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhu_ce);
        EditText editText1=(findViewById(R.id.zhuce_et1));
        EditText editText2=(findViewById(R.id.zhuce_et2));
        EditText editText3=(findViewById(R.id.zhuce_et3));
        Button button=(findViewById(R.id.zhuce_button));





        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText1.length()!=0 && editText2.length()!=0 && editText3.length()!=0){
                    if (editText2.getText().toString().trim().equals(editText3.getText().toString().trim())==true){
                        String a=editText1.getText().toString();
                        String b=editText2.getText().toString();
                        SharedPreferences.Editor editor = getSharedPreferences("data",
                                MODE_PRIVATE).edit();
                        editor.putString("name", a);
                        editor.putString("mima", b);
                        editor.apply();
                        startActivity(new Intent(zhu_ce.this,button.class));
                        finish();
                    }else {
                        Toast.makeText(zhu_ce.this,"两次密码输入不一致",Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(zhu_ce.this,"有未输入内容",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}