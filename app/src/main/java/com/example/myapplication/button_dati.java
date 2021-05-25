package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class button_dati extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_dati);
        Button button1=findViewById(R.id.button_dati_bt1);
        Button button2=findViewById(R.id.button_dati_bt2);
        Button button3=findViewById(R.id.button_dati_bt3);

        RadioGroup radioGroup1=findViewById(R.id.button_dati_rg1);
        RadioGroup radioGroup2=findViewById(R.id.button_dati_rg2);

        RadioButton radioButton1=findViewById(R.id.button_dati_rb1);
        RadioButton radioButton2=findViewById(R.id.button_dati_rb2);
        RadioButton radioButton3=findViewById(R.id.button_dati_rb3);
        RadioButton radioButton4=findViewById(R.id.button_dati_rb4);
        CheckBox checkBox5=findViewById(R.id.button_dati_ck5);
        CheckBox checkBox6=findViewById(R.id.button_dati_ck6);
        CheckBox checkBox7=findViewById(R.id.button_dati_ck7);
        CheckBox checkBox8=findViewById(R.id.button_dati_ck8);

        EditText editText=findViewById(R.id.button_dati_et1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i=0;i<radioGroup1.getChildCount();i++){
                    RadioButton radioButton=(RadioButton) radioGroup1.getChildAt(i);
                    if (radioButton.isChecked()){
                        if (radioButton.getText().equals("选项一")){
                            Toast.makeText(button_dati.this,"选对了",Toast.LENGTH_LONG).show();
                        }
                        else {
                            AlertDialog.Builder builder=new AlertDialog.Builder(button_dati.this);
                            builder.setMessage("错误");
                            builder.setPositiveButton("确定",null).show();
                        }
                        break;
                    }
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String onChlick="";
                if (checkBox5.isChecked()){
                    onChlick+=checkBox5.getText().toString();

                }
                if (checkBox6.isChecked()){
                    onChlick+=checkBox6.getText().toString();

                }
                if (checkBox7.isChecked()){
                    onChlick+=checkBox7.getText().toString();

                }
                if (checkBox8.isChecked()){
                    onChlick+=checkBox8.getText().toString();

                }
                Toast.makeText(button_dati.this,onChlick,Toast.LENGTH_SHORT).show();
            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().equals("3")){
                    Toast.makeText(button_dati.this,"答对了",Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
}