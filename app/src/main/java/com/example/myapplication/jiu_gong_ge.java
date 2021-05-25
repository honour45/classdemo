package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;

public class jiu_gong_ge extends AppCompatActivity {
private ImageView[] img=new ImageView[12];
private int[] ingpath=new int[]{
        R.mipmap.i3,R.mipmap.i3,R.mipmap.i3,R.mipmap.i3,R.mipmap.i3,R.mipmap.i3,
        R.mipmap.i3,R.mipmap.i3,R.mipmap.i3,R.mipmap.i3,R.mipmap.i3,R.mipmap.i3
};
private GridLayout gridLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jiu_gong_ge);
        gridLayout=(GridLayout)findViewById(R.id.gl);
        for(int i=0;i<img.length;i++){
            img[i]=new ImageView(jiu_gong_ge.this);//创建图片布局
            img[i].setImageResource(ingpath[i]);//获取图片资源
            img[i].setPadding(2,2,2,2);//设置间距
            ViewGroup.LayoutParams params=new ViewGroup.LayoutParams(500,100);// ViewGroup的子类,LayoutParams 的作用：指定视图View 的高度（height） 和 宽度（width）等布局参数
            img[i].setLayoutParams(params);
            gridLayout.addView(img[i]);
        }




    }
}