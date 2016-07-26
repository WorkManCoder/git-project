package com.zhitou168.simple.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.util.AttributeSet;
import android.view.View;


public class SimpleMetrix extends View {
    private ColorMatrix matrix;

    public SimpleMetrix(Context context) {
        super(context);
    }

    public SimpleMetrix(Context context, AttributeSet attrs) {
        super(context, attrs);
        matrix = new ColorMatrix(new float[]{
                1, 1, 1, 1, 1
                , 1, 1, 1, 1, 1
                , 1, 1, 1, 1, 1
                , 1, 1, 1, 1, 1});
    }

    public SimpleMetrix(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

    }
}
