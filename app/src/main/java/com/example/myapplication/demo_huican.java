package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class demo_huican extends AppCompatActivity {
private Button huicanbt;
private ImageView huicanim;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==0x11 && resultCode==0x11){
                Bundle bundle=data.getExtras();
                int icon1=bundle.getInt("icon1");
                ImageView imageView=(ImageView)findViewById(R.id.huicanim);
                imageView.setImageResource(icon1);

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_huican);
        huicanbt=findViewById(R.id.huicanbt);
        huicanim=findViewById(R.id.huicanim);
        huicanbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(demo_huican.this,demo_huican2.class);
                startActivityForResult(intent,0x11);

            }
        });
    }
}