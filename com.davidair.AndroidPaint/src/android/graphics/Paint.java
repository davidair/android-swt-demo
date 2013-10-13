package android.graphics;

public class Paint {

	public Paint(int flags) {
		_style = Style.FILL_AND_STROKE;
	}

	public static final int ANTI_ALIAS_FLAG = 0;

	private float _textSize;
	private Color _color;
	
	public void setColor(Color color) {
		_color = color;
	}
	
	public Color getColor()
	{
		return _color;
	}

	public void setTextSize(float size) {
		_textSize = size;
	}
	
	public float getTextSize()
	{
		return _textSize;
	}
	
    public enum Style {
        /**
         * Geometry and text drawn with this style will be filled, ignoring all
         * stroke-related settings in the paint.
         */
        FILL            (0),
        /**
         * Geometry and text drawn with this style will be stroked, respecting
         * the stroke-related fields on the paint.
         */
        STROKE          (1),
        /**
         * Geometry and text drawn with this style will be both filled and
         * stroked at the same time, respecting the stroke-related fields on
         * the paint. This mode can give unexpected results if the geometry
         * is oriented counter-clockwise. This restriction does not apply to
         * either FILL or STROKE.
         */
        FILL_AND_STROKE (2);
        
        Style(int nativeInt) {
            this.nativeInt = nativeInt;
        }
        final int nativeInt;
    }
    
    private Style _style;

	public void setStyle(Style style) {
		_style = style;
	}
	
	public Style getStyle()
	{
		return _style;
	}
	

}
