package android.graphics;

import org.eclipse.swt.SWT;

public class Color {

	public static final Color BLUE = new Color(SWT.COLOR_BLUE);
	public static final Color GREEN = new Color(SWT.COLOR_GREEN);
	
	private int _swtColor;
	
	public Color(int swtColor)
	{
		_swtColor = swtColor;
	}

	public int getSWTColor()
	{
		return _swtColor;
	}
}
