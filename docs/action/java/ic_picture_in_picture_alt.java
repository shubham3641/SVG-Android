package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_picture_in_picture_alt extends SVGRenderer {

    public ic_picture_in_picture_alt(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(19.0f, 11.0f);
        mPath.rLineTo(-8.0f, 0f);
        mPath.rLineTo(0f, 6.0f);
        mPath.rLineTo(8.0f, 0f);
        mPath.rLineTo(0f, -6.0f);
        mPath.close();
        mPath.moveTo(19.0f, 11.0f);
        mPath.rMoveTo(4.0f, 8.0f);
        mPath.lineTo(23.0f, 4.98f);
        mPath.cubicTo(23.0f, 3.88f, 22.1f, 3.0f, 21.0f, 3.0f);
        mPath.lineTo(3.0f, 3.0f);
        mPath.rCubicTo(-1.1f, 0.0f, -2.0f, 0.88f, -2.0f, 1.98f);
        mPath.lineTo(1.0f, 19.0f);
        mPath.rCubicTo(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        mPath.rLineTo(18.0f, 0f);
        mPath.rCubicTo(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mPath.close();
        mPath.moveTo(23.0f, 19.0f);
        mPath.rMoveTo(-2.0f, 0.02f);
        mPath.lineTo(3.0f, 19.02f);
        mPath.lineTo(3.0f, 4.97f);
        mPath.rLineTo(18.0f, 0f);
        mPath.rLineTo(0f, 14.05f);
        mPath.close();
        mPath.moveTo(21.0f, 19.02f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}