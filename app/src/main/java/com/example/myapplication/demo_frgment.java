package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.app.Fragment;
import com.example.myapplication.frgment.BlankFragment1;
import com.example.myapplication.frgment.BlankFragment2;
import com.example.myapplication.frgment.BlankFragment3;
import com.example.myapplication.frgment.BlankFragment4;

public class demo_frgment extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_frgment);
        ImageView im1=(ImageView)findViewById(R.id.demo_iv1);
        ImageView im2=(ImageView)findViewById(R.id.demo_iv2);
        ImageView im3=(ImageView)findViewById(R.id.demo_iv3);
        ImageView im4=(ImageView)findViewById(R.id.demo_iv4);

        im1.setOnClickListener(listener);
        im2.setOnClickListener(listener);
        im3.setOnClickListener(listener);
        im4.setOnClickListener(listener);

    }
    View.OnClickListener listener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            FragmentManager fragmentManager=getFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            Fragment fragment=null;

            switch (view.getId()){
                case R.id.demo_iv1:
                    fragment=new BlankFragment1();
                    break;
                case R.id.demo_iv2:
                    fragment=new BlankFragment2();
                    Log.d("BlankFragment2","√");
                    break;
                case R.id.demo_iv3:
                    fragment=new BlankFragment3();
                    Log.d("BlankFragment3","√");

                    break;
                case R.id.demo_iv4:
                    fragment=new BlankFragment4();
                    Log.d("BlankFragment4","√");
                    break;
                default:
                    break;
            }
            fragmentTransaction.replace(R.id.demo_fg,fragment).commit();
        }
    };
}