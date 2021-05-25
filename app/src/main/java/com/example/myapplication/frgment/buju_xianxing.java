package com.example.myapplication.frgment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;
import com.example.myapplication.R;
import com.example.myapplication.zhuye;


public class buju_xianxing extends Fragment {
private  Button bt1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_buju_xianxing, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        bt1=(Button)getActivity().findViewById(R.id.f_xianxing_bt1);
        bt1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getActivity(), "success2",Toast.LENGTH_SHORT).show();
            }
        });
    }

}