package com.codekul.customviewapp;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by root on 9/5/16.
 */
public class MyView extends View {

    private String color;
    private int radius;
    public MyView(Context context) {
        super(context);

        // it will be invoked when view is going to be created by code
    }

    public MyView(Context context,AttributeSet attr) {
        super(context, attr);

        // it will be invoked when view is going to be created by xml

        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attr, R.styleable.MyView, 0, 0);

        color = typedArray.getString(R.styleable.MyView_cirCol);

        radius = typedArray.getInt(R.styleable.MyView_cirRad, 10);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.parseColor(color));

        canvas.drawCircle(30,30,radius,paint);
    }
}
