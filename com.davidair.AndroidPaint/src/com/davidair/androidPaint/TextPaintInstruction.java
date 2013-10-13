package com.davidair.androidPaint;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.widgets.Display;

import android.graphics.Paint;


public class TextPaintInstruction extends PaintInstruction {

	private final String _text;
	private final int _x;
	private final int _y;
	
	public TextPaintInstruction(Paint paint, String text, int x, int y)
	{
		super(paint);
		
		_text = text;
		_x = x;
		_y = y;
	}
	
	@Override
	public void Draw(PaintEvent e, Display display) {
		SetDrawStyle(e, display);
		e.gc.drawText(_text, _x, (int) (_y - _paint.getTextSize()), true);
	}
}

