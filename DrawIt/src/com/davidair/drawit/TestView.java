package com.davidair.drawit;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class TestView extends View {

	private Paint _paint;
	private RectF _bounds;
	
	public TestView(Context context) {
		super(context);
		
		initialize();
	}
	
	
	public TestView(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		initialize();
	}
	
	private void initialize()
	{
		setWillNotDraw(false);
		
		_paint = new Paint(Paint.ANTI_ALIAS_FLAG);
		_paint.setColor(Color.GREEN);
		_paint.setStyle(Paint.Style.STROKE);
		_paint.setTextSize(100);
		
		_bounds = new RectF(0, 0, getWidth(), getHeight());
	}
	
	 @Override
	protected void onSizeChanged(int w, int h, int oldw, int oldh) {
		 super.onSizeChanged(w, h, oldw, oldh);
		 _bounds = new RectF(0, 0, w, h);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		
		canvas.drawRect(_bounds, _paint);
		canvas.drawText("hello", 0, 100, _paint);
	}
}
