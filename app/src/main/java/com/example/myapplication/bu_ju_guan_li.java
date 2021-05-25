package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;

import com.example.myapplication.adpter.ViewPagerAdapter;
import com.example.myapplication.frgment.buju_biaoge;
import com.example.myapplication.frgment.buju_wangge;
import com.example.myapplication.frgment.buju_xiangdui;
import com.example.myapplication.frgment.buju_xianxing;
import com.example.myapplication.frgment.buju_zhen;

import java.util.ArrayList;
import java.util.List;
public class bu_ju_guan_li extends AppCompatActivity {
private ViewPager viewPager;
private RadioGroup radioGroup;
private Button b1,b2,b3,b4,b5;
List<Fragment>fragments =new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bu_ju_guan_li);
        viewPager=(ViewPager)findViewById(R.id.vp);
        radioGroup=(RadioGroup)findViewById(R.id.rg);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);

//        View view1 = LayoutInflater.from(this).inflate(R.layout.fragment_buju_xiangdui, null);
//        View view2 = LayoutInflater.from(this).inflate(R.layout.fragment_buju_xianxing, null);
//        View view3 = LayoutInflater.from(this).inflate(R.layout.fragment_buju_zhen, null);
//        View view4 = LayoutInflater.from(this).inflate(R.layout.fragment_buju_biaoge, null);
//        View view5 = LayoutInflater.from(this).inflate(R.layout.fragment_buju_wangge, null);

//        fragments.add(view1);
//        fragments.add(view2);
//        fragments.add(view3);
//        fragments.add(view4);
//        fragments.add(view5);
//        viewPager=findViewById(R.id.vp);
//        viewPager.setAdapter(new ViewPagerAdapter(fragments));

        fragments.add(new buju_xiangdui());
        fragments.add(new buju_xianxing());
        fragments.add(new buju_zhen());
        fragments.add(new buju_biaoge());
        fragments.add(new buju_wangge());

        viewPager.setOffscreenPageLimit(5);
        viewPager.setAdapter(new MyPagerAdapter3(getSupportFragmentManager()));
        setListener();
    }

    class MyPagerAdapter3 extends FragmentPagerAdapter {
        public MyPagerAdapter3(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int i) {
            return fragments.get(i);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }
    }

    private void setListener(){
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(3);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(4);
            }
        });
    }

}
