package com.davidair.androidPaint;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.widgets.Display;

import android.graphics.Paint;
import android.graphics.Paint.Style;


public class RectanglePaintInstruction extends PaintInstruction {

	private float _x;
	private float _y;
	private float _width;
	private float _height;
	
	public RectanglePaintInstruction(Paint paint, float x, float y, float width, float height) {
		super(paint);
		
		_x = x;
		_y = y;
		_width = width;
		_height = height;
	}

	@Override
	public void Draw(PaintEvent e, Display display) {

		SetDrawStyle(e, display);
		
		Style style = _paint.getStyle();
		
		if (style == Style.FILL_AND_STROKE || style == Style.STROKE)
		{
			e.gc.drawRectangle((int)_x, (int)_y, (int)_width, (int)_height);	
		}
		
		if (style == Style.FILL_AND_STROKE || style == Style.FILL)
		{
			e.gc.fillRectangle((int)_x, (int)_y, (int)_width, (int)_height);	
		}
	}
}
