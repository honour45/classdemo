package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

public class taiqiu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout frameLayout=new FrameLayout(this);
        frameLayout.setBackgroundResource(R.mipmap.a);
        setContentView(frameLayout);
        TextView textView=new TextView(this);
        textView.setText("开始");
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP,18);//转变为标准尺寸的一个函数
        textView.setTextColor(Color.rgb(17,85,114));
        FrameLayout.LayoutParams params=new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);//尺寸大小
        params.gravity= Gravity.CENTER;
        textView.setLayoutParams(params);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //alert,(setTitle)-标题    (setMessage)-内容  (setPositiveButton)-确定按钮  （setNegativeButton）-取消按钮
                new AlertDialog.Builder(taiqiu.this).setTitle("系统提示").setMessage("确定进入？").setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast toast=Toast.makeText(taiqiu.this,"游戏开始",Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }).setNegativeButton("退出", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast toast=Toast.makeText(taiqiu.this,"已退出",Toast.LENGTH_SHORT);
                        toast.show();
                        finish();
                    }
                }).show();
            }
        });

        frameLayout.addView(textView);

    }
}