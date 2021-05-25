package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class list_demo2 extends AppCompatActivity {
private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_demo2);
        listView=findViewById(R.id.l_d_l_1);
        int[] imgs=new int[]{R.drawable.tou,R.drawable.tou,R.drawable.tou,R.drawable.tou,
                R.drawable.tou,R.drawable.tou,R.drawable.tou,};
        String[] lt=new String[]{"小明1","小明2","小明3","小明4","小明5","小明6","小明7"};
        List<Map<String,Object>> mapList=new ArrayList<Map<String,Object>>();
//        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, R.layout.list_demo2a);
        for (int i=0;i<imgs.length;i++){
            Map<String,Object> map=new HashMap<String,Object>();
            map.put("img",imgs[i]);
            map.put("name",lt[i]);
            mapList.add(map);
        }
        SimpleAdapter adapter=new SimpleAdapter(this,mapList,R.layout.list_demo2a
        ,new String[] {"name","img"},new int[] {R.id.list_demo2_tt,R.id.list_demo2_im});
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Map<String,Object>map=(Map<String,Object>)adapterView.getItemAtPosition(i);
                Toast.makeText(list_demo2.this,map.get("name").toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}