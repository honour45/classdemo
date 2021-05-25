package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

public class kong_jian2 extends AppCompatActivity {
private Handler mhandler;
private int i;
private int seekWidth = 60;
private int seekHeight = 30;
private ProgressBar progressBar;
private ImageView imageView1;
private SeekBar seekBar;
private TextView textView1;
private RatingBar ratingBar;
private ImageSwitcher imageSwitcher;
private int[] arrimage=new int[]{R.drawable.img01,R.drawable.photo,R.drawable.photo,
        R.drawable.photo,R.drawable.photo,R.drawable.photo,
        R.drawable.photo,R.drawable.photo,R.drawable.img02,};
private int index;
private float touchdownx;
private float touchupx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kong_jian2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        progressBar=findViewById(R.id.kongjian2_pbar);
        textView1=findViewById(R.id.kongjian2_tt1);
        seekBar=findViewById(R.id.kongjian2_sber);
        imageView1=findViewById(R.id.kongjian2_im1);
        ratingBar=findViewById(R.id.kongjina2_ratingbar);

        imageSwitcher=findViewById(R.id.kongjian2_imsw1);

/*
Handler消息
 */
        mhandler=new Handler(){
            @Override
            public void handleMessage(@NonNull Message msg) {
                if (msg.what==1){
                    progressBar.setProgress(i);
                    textView1.setText(i+"%");
                }else {
                    progressBar.setVisibility(View.INVISIBLE);
                    textView1.setVisibility(View.INVISIBLE);

                }
            }
        };



/*
线程
 */
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    i=work();
                    Message message=new Message();
                    if (i<100){
                        message.what=1;
                        mhandler.sendMessage(message);

                    }else {
                        message.what=2;
                        mhandler.sendMessage(message);
                        break;
                    }
                }
            }
            private int work(){
                i+=Math.random()*10;
                try {
                        Thread.sleep(200);
                }catch (InterruptedException e){
                        e.printStackTrace();
                }
                return i;
            }
        }).start();

//拖动
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                //当前进度 i
                imageView1.setImageAlpha(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //开始
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //结束
            }
        });

//星级条
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                        String s=String.valueOf(ratingBar.getRating());//等级
                        String s2=String.valueOf(ratingBar.getProgress());//进度
                        String s3=String.valueOf(ratingBar.getStepSize());//每次最少改变

                Toast.makeText(kong_jian2.this,"当前星级:"+s+"进度："+s2+"每次改变:"+s3,Toast.LENGTH_SHORT).show();


            }
        });

//图片切换
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                    ImageView imageView=new ImageView(kong_jian2.this);
                    imageView.setImageResource(arrimage[index]);
                return imageView;
            }
        });
        imageSwitcher.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    touchdownx=motionEvent.getX();
                    return true;
                }else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                    touchupx=motionEvent.getX();
                    if (touchupx-touchdownx>100){
                        index=index==0?arrimage.length-1:index-1;
                        imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(kong_jian2.this,R.anim.slide_in_left));
                        imageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(kong_jian2.this,R.anim.slide_out_right));
                        imageSwitcher.setImageResource(arrimage[index]);
                    }else if (touchdownx-touchupx>100){
                        index=index==arrimage.length-1?0:index+1;
                        imageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(kong_jian2.this,R.anim.slide_in_left));
                        imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(kong_jian2.this,R.anim.slide_out_right));
                        imageSwitcher.setImageResource(arrimage[index]);
                    }
                    return true;
                }
                return false;
            }
        });







    }
}