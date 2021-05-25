package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

import com.example.myapplication.clas.RabbitView;

public class tu_zi_yi_dong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tu_zi_yi_dong);
        FrameLayout frameLayout=(FrameLayout)findViewById(R.id.fl);
        final RabbitView rabbitView=new RabbitView(this);
        rabbitView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                rabbitView.X=motionEvent.getX();
                rabbitView.Y=motionEvent.getY();
                rabbitView.invalidate();

                return true;
            }
        });
        frameLayout.addView(rabbitView);

    }
}