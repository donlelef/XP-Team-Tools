package listPrinting;

import java.awt.Graphics;

/**
 * This interface represents any kind of drawable object
 * 
 * @author simone
 * @see Graphics
 *
 */
public interface Drawable {

	/**
	 * Use the specified {@link Graphics} object to draw this {@link Drawable}
	 * istance
	 * 
	 * @param g
	 *            : the graphics element that will draw this {@link Drawable}
	 *            istance
	 */
	public void draw(Graphics g);

}