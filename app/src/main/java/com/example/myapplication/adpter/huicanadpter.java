package com.example.myapplication.adpter;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.SimpleAdapter;

import com.example.myapplication.R;

import java.util.List;
import java.util.Map;

public class huicanadpter extends Activity implements AdapterView.OnItemClickListener {
    private List<Map<String, Object>> dataList;//创建List<Map数组>简单适配器要用到的.
    private int[] icon1 = {R.drawable.touxiang1,R.drawable.touxiang2,R.drawable.touxiang3,R.drawable.touxiang4,R.drawable.touxiang5,};//获得要传入数据源图片的id集合数据源
    private SimpleAdapter adapter;


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
