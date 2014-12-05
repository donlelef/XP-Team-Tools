package drawings.drawables;

import java.awt.Graphics;

import drawings.Drawable;

/**
 * The concrete implementor let you draw the single shape with its own parameter.
 * @author cl411645
 *
 */

public class Rectangle implements Drawable {

	private int x, y, width, height;
	
	/**
	 * 
	 * @param x distance from the left side of the panel to the rectangle 
	 * @param y distance from the upper side of the panel to the rectangle
	 * @param width
	 * @param height
	 */

	public Rectangle(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw(Graphics g) {
		g.drawRect(x, y, width, height);  // fillRect creates a colored shape
	}

}
