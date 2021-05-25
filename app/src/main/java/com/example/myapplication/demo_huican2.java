package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class demo_huican2 extends AppCompatActivity {
private GridView gridLayout;

    private int[] icon1 = {R.drawable.touxiang1,R.drawable.touxiang2,R.drawable.touxiang3,R.drawable.touxiang4,R.drawable.touxiang5,};//获得要传入数据源图片的id集合数据源
    private SimpleAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_huican2);
        gridLayout=findViewById(R.id.huicangl);
        BaseAdapter baseAdapter=new BaseAdapter() {
            @Override
            public int getCount() {
                return icon1.length;
            }
            @Override
            public Object getItem(int i) {
                return i;
            }
            @Override
            public long getItemId(int i) {
                return i;
            }
            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                ImageView img;
                if (view==null){
                    img=new ImageView(demo_huican2.this);
                    img.setAdjustViewBounds(true);//不能单独使用，
                    img.setMaxHeight(120);
                    img.setMaxWidth(120);
                    img.setPadding(5,5,5,5);
                }else {
                    img=(ImageView)view;
                }
                img.setImageResource(icon1[i]);
                return img;
            }

        };
        gridLayout.setAdapter(baseAdapter);
        gridLayout.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=getIntent();
                Bundle bundle=new Bundle();
                bundle.putInt("icon1",icon1[i]);
                intent.putExtras(bundle);
                setResult(0x11,intent);
                finish();
            }
        });



    }
}