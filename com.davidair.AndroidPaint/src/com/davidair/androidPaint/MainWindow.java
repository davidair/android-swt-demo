package com.davidair.androidPaint;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import android.content.Context;

import com.davidair.drawit.TestView;


public class MainWindow {

	private static void ShowUI()
	{
		Display display = null;

		try {
			display = new Display();
			
			// Create a shell with no trim
			final Shell shell = new Shell(display);
			shell.setForeground(display.getSystemColor(SWT.COLOR_WHITE));

			shell.setText("Android Paint in SWT");

			// set the transparent canvas on the shell
			Canvas canvas = new Canvas(shell, SWT.BACKGROUND);

			// create an area to paint the text
			Rectangle size = new Rectangle(0, 0, 640, 900);
			canvas.setBounds(size);

			canvas.setBackground(display.getSystemColor(SWT.COLOR_WHITE));
			
			// define the shape of the shell using setRegion
			shell.setSize(size.width, size.height);

			TestView funView = new TestView(new Context());
			funView.setWidth(620);
			funView.setHeight(870);
			funView.draw(new SWTCanvas(canvas, display));

			shell.open();
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch())
					display.sleep();
			}

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		} finally {
			if (display != null) {
				display.dispose();
			}
		}
	
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShowUI();
	}
}
