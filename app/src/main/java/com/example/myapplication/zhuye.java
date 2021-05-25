package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class zhuye extends AppCompatActivity implements View.OnClickListener{
    private Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16;
    private LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhuye);
        bt1=(Button)findViewById(R.id.btn1);
        bt2=(Button)findViewById(R.id.btn2);
        bt3=(Button)findViewById(R.id.btn3);
        bt4=(Button)findViewById(R.id.btn4);
        bt5=(Button)findViewById(R.id.btn5);
        bt6=(Button)findViewById(R.id.btn6);
        bt7=(Button)findViewById(R.id.btn7);
        bt8=(Button)findViewById(R.id.btn8);
        bt9=(Button)findViewById(R.id.btn9);
        bt10=(Button)findViewById(R.id.btn10);
        bt11=(Button)findViewById(R.id.btn11);
        bt12=(Button)findViewById(R.id.btn12);
        bt13=(Button)findViewById(R.id.btn13);
        bt14=(Button)findViewById(R.id.btn14);
        bt15=(Button)findViewById(R.id.btn15);
        bt16=(Button)findViewById(R.id.btn16);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        bt10.setOnClickListener(this);
        bt11.setOnClickListener(this);
        bt12.setOnClickListener(this);
        bt13.setOnClickListener(this);
        bt14.setOnClickListener(this);
        bt15.setOnClickListener(this);
        bt16.setOnClickListener(this);


        bt1.setText(getResources().getString(R.string.one));

    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn1:
                startActivity(new Intent(zhuye.this, MainActivity.class));
                break;
            case R.id.btn2:
                startActivity(new Intent(zhuye.this, taiqiu.class));
                break;
            case R.id.btn3:
                startActivity(new Intent(zhuye.this, jiu_gong_ge.class));
                break;
            case R.id.btn4:
                startActivity(new Intent(zhuye.this, bu_ju_guan_li.class));
                break;
            case R.id.btn5:
                startActivity(new Intent(zhuye.this, bu_ju_qian_tao.class));
                break;
            case R.id.btn6:
                startActivity(new Intent(zhuye.this, tu_zi_yi_dong.class));
                break;
            case R.id.btn7:
                startActivity(new Intent(zhuye.this, button.class));
                break;
            case R.id.btn8:
                startActivity(new Intent(zhuye.this, kong_jian.class));
                break;
            case R.id.btn9:
                startActivity(new Intent(zhuye.this, kong_jian2.class));
                break;
            case R.id.btn10:
                startActivity(new Intent(zhuye.this, list_demo.class));
                break;
            case R.id.btn11:
                startActivity(new Intent(zhuye.this, list_demo2.class));
                break;
            case R.id.btn12:
                startActivity(new Intent(zhuye.this, twelve_xuanxiangka.class));
                break;
            case R.id.btn13:
                startActivity(new Intent(zhuye.this, demo_intent.class));
                break;
            case R.id.btn14:
                startActivity(new Intent(zhuye.this, demo_huican.class));
                break;
            case R.id.btn15:
                startActivity(new Intent(zhuye.this, demo_frgment.class));
                break;
            case R.id.btn16:
                startActivity(new Intent(zhuye.this, deno_str.class));
                break;
        }
    }
}