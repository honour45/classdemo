package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Time;
import java.util.Calendar;

public class kong_jian extends AppCompatActivity {
    int year,month,day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kong_jian);
        RadioGroup radioGroup=(findViewById(R.id.kongjian_rg1));
        RadioGroup radioGroup2=(findViewById(R.id.kongjian_rg2));
        Button button=(findViewById(R.id.kongjian_bt1));
        Button button2=(findViewById(R.id.kongjian_bt2));
        Button button3=(findViewById(R.id.kongjian_bt3));
        Button button4=(findViewById(R.id.kongjian_bt4));
        Button button5=(findViewById(R.id.kongjian_bt5));
        Button button6=(findViewById(R.id.kongjian_bt6));


        CheckBox checkBox1=(findViewById(R.id.kongjian_check1));
        CheckBox checkBox2=(findViewById(R.id.kongjian_check2));
        CheckBox checkBox3=(findViewById(R.id.kongjian_check3));


        RadioButton radioButton1=(findViewById(R.id.kongjian_rb1));
        RadioButton radioButton2=(findViewById(R.id.kongjian_rb2));
        RadioButton radioButton3=(findViewById(R.id.kongjian_rb3));


        RadioButton radioButton4=(findViewById(R.id.kongjian_rb4));
        RadioButton radioButton5=(findViewById(R.id.kongjian_rb5));
        RadioButton radioButton6=(findViewById(R.id.kongjian_rb6));
        RadioButton radioButton7=(findViewById(R.id.kongjian_rb7));

        DatePicker datePicker=(findViewById(R.id.datepiker));

        TimePicker timePicker=(findViewById(R.id.kongjian_tp1));
        TextView textView1=(findViewById(R.id.kongjina_tv1));
        timePicker.setIs24HourView(true);


        Chronometer chronometer=(findViewById(R.id.kongjian_chromometer));

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i==R.id.kongjian_rb1){
                    Toast.makeText(kong_jian.this,radioButton1.getText().toString(),Toast.LENGTH_SHORT).show();
                }else if (i==R.id.button_dati_rb2){
                    Toast.makeText(kong_jian.this,radioButton2.getText().toString(),Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(kong_jian.this,radioButton3.getText().toString(),Toast.LENGTH_SHORT).show();
                }
            }
        });



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i=0;i<radioGroup2.getChildCount();i++){
                    RadioButton radioButton=(RadioButton) radioGroup2.getChildAt(i);
                    if (radioButton.isChecked()){
                        if (radioButton.getText().equals("选项一")){
                            Toast.makeText(kong_jian.this,"选对了",Toast.LENGTH_LONG).show();
                        }
                        else {
                            AlertDialog.Builder builder=new AlertDialog.Builder(kong_jian.this);
                            builder.setMessage("错误");
                            builder.setPositiveButton("确定",null).show();
                        }
                        break;
                    }
                }
            }
        });
/*
复选框
 */
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String onChlick="";
                if (checkBox1.isChecked()){
                    onChlick+=checkBox1.getText().toString();
                }
                if (checkBox2.isChecked()){
                    onChlick+=checkBox2.getText().toString();

                }
                if (checkBox3.isChecked()){
                    onChlick+=checkBox3.getText().toString();

                }
                Toast.makeText(kong_jian.this,onChlick,Toast.LENGTH_SHORT).show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
/*
datepacker
 */
        Calendar calendar=Calendar.getInstance();
        year=calendar.get(Calendar.YEAR);
        month=calendar.get(Calendar.MONTH);
        day=calendar.get(Calendar.DAY_OF_MONTH);
        datePicker.init(year, month, day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                kong_jian.this.year=i;
                kong_jian.this.month=i1;
                kong_jian.this.day=i2;
                showtime(i,i1,i2);
            }
        });

        /*
        TimePicker
         */

        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1) {
                String time2=i+"时"+i1+"分";
//                Toast.makeText(kong_jian.this,time2,Toast.LENGTH_SHORT).show();
                textView1.setText(time2);
            }
        });

        /*
        倒计时
        chromometer
         */
        chronometer.setFormat("计时时间%s");
        //start
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chronometer.start();
                chronometer.setBase(SystemClock.elapsedRealtime());//返回自启动以来的毫秒数，包括睡眠时间
            }
        });
        //stop
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            chronometer.stop();
            }
        });
        //zero clearning
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chronometer.setBase(SystemClock.elapsedRealtime());
            }
        });
        chronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {

            }
        });
    }


    void showtime(int year,int month,int day){
            String time=year+"年"+month+1+"月"+day+"日";
            Toast.makeText(kong_jian.this,time,Toast.LENGTH_SHORT).show();
    }
}
