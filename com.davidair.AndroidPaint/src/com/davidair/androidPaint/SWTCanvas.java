package com.davidair.androidPaint;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.widgets.Display;

import android.graphics.Paint;
import android.graphics.RectF;

public class SWTCanvas extends android.graphics.Canvas
{
	private List<PaintInstruction> _paintInstructions;
	
	public SWTCanvas(org.eclipse.swt.widgets.Canvas canvas, final Display display)
	{
		_paintInstructions = new ArrayList<PaintInstruction>();
		
		canvas.addPaintListener(new PaintListener() {
			public void paintControl(PaintEvent e) {

				for (PaintInstruction instruction : _paintInstructions)
				{
					instruction.Draw(e, display);
				}
			}
		});
	}

	@Override
	public void drawOval(RectF bounds, Paint paint) {
		_paintInstructions.add(new OvalPaintInstruction(paint, bounds.left, bounds.top, bounds.width(), bounds.height()));
	}

	@Override
	public void drawText(String string, int i, int j, Paint paint) {
		_paintInstructions.add(new TextPaintInstruction(paint, string, i, j));
		
	}

	@Override
	public void drawRect(RectF bounds, Paint paint) {
		_paintInstructions.add(new RectanglePaintInstruction(paint, bounds.left, bounds.top, bounds.width(), bounds.height()));
	}
}
