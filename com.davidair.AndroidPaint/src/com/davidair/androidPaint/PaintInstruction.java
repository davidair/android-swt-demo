package com.davidair.androidPaint;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Display;

public abstract class PaintInstruction {
	
	protected android.graphics.Paint _paint;
	
	public PaintInstruction(android.graphics.Paint paint)
	{
		_paint = paint;
	}
	
	public abstract void Draw(PaintEvent e, Display display);
	
	protected void SetDrawStyle(PaintEvent e, Display display)
	{
		int pointSize = (int) (72 * _paint.getTextSize() / display.getDPI().y);
		
		Font font = e.gc.getFont();
		FontData[] fd = font.getFontData();
		fd[0].setHeight(pointSize);

		Font bigFont = new Font(display, fd[0]);
		e.gc.setFont(bigFont);
		
		e.gc.setForeground(display.getSystemColor(_paint.getColor().getSWTColor()));
		e.gc.setBackground(display.getSystemColor(_paint.getColor().getSWTColor()));

	}
}
