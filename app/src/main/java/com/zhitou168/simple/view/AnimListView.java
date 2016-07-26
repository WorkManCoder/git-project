package com.zhitou168.simple.view;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.widget.ListView;


public class AnimListView extends ListView {
    private Camera camera;
    private Matrix matrix;

    public AnimListView(Context context) {
        super(context);
    }

    public AnimListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        camera = new Camera();
        matrix = new Matrix();
    }

    public AnimListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        camera.save();
        camera.rotate(30, 0, 0);
        camera.getMatrix(matrix);
        matrix.preTranslate(-getWidth() / 2, -getHeight() / 2);
        matrix.preTranslate(getWidth() / 2, getHeight() / 2);
        canvas.concat(matrix);
        super.onDraw(canvas);
        camera.restore();
    }
}
