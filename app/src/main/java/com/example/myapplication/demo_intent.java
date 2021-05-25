package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class demo_intent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_intent);
        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String site1 = ((EditText) findViewById(R.id.et_site1)).getText().toString();
                String site2 = ((EditText) findViewById(R.id.et_site2)).getText().toString();
                String site3 = ((EditText) findViewById(R.id.et_site3)).getText().toString();
                String name = ((EditText) findViewById(R.id.et_name)).getText().toString();
                String phone = ((EditText) findViewById(R.id.et_phone)).getText().toString();
                String email = ((EditText) findViewById(R.id.et_email)).getText().toString();
                if (!"".equals(site1)&& !"".equals(site2)&& !"".equals(site3)
                        && !"".equals(name)&& !"".equals(phone)&& !"".equals(email)) {
                    Intent intent = new Intent(demo_intent.this, demo_intent2.class);
                    Bundle bundle = new Bundle();
                    bundle.putCharSequence("name", name);
                    bundle.putCharSequence("phone", phone);
                    bundle.putCharSequence("site1", site1);
                    bundle.putCharSequence("site2", site2);
                    bundle.putCharSequence("site3", site3);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }else{
                    Toast.makeText(demo_intent.this,"请将收货地址写完整！", Toast.LENGTH_SHORT).show();;
                }


            }
        });

    }
}