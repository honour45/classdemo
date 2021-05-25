package com.example.myapplication.clas;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

import com.example.myapplication.R;

import static android.os.Build.VERSION_CODES.R;

public class RabbitView extends View {
    public float X,Y;
    public RabbitView(Context context) {
        super(context);
        X=290;
        Y=130;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        Bitmap bitmap=BitmapFactory.decodeResource(this.getResources(), com.example.myapplication.R.drawable.tou);
        canvas.drawBitmap(bitmap,X,Y,paint);
        if (bitmap.isRecycled()){
            bitmap.recycle();
        }
    }
}
