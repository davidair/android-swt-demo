package android.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

public class View {

	private int _width;
	private int _height;
	
	public View(Context context) {
		// TODO Auto-generated constructor stub
	}

	public View(Context context, AttributeSet attrs) {
		// TODO Auto-generated constructor stub
	}

	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		
	}
	
	public void draw(Canvas canvas)
	{
		onDraw(canvas);
	}
	
	public void setWillNotDraw(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
	public void setWidth(int width)
	{
		int oldWidth = _width;
		_width = width;
		onSizeChanged(width, _height, oldWidth, _height);
	}
	
	public void setHeight(int height)
	{
		int oldHeight = _height;
		_height = height;
		onSizeChanged(_width, height, _width, oldHeight);
	}

	public int getWidth()
	{
		return _width;
	}
	
	public int getHeight()
	{
		return _height;
	}
	
	protected void onSizeChanged(int w, int h, int oldw, int oldh) {
	}
}
