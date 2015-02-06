package listPrinting;

import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * This class represents a JPanel able to draw one or more istance of
 * {@link Drawable} implementations
 * 
 * @author simone
 * @see JPanel, {@link Drawable}
 *
 */
public class DrawablePanel extends JPanel {

	private Drawable[] drawables;

	/**
	 * Creates a new istance of this class
	 * 
	 * @param drawables
	 *            : the objects to draw
	 */
	public DrawablePanel(Drawable... drawables) {
		super();
		this.drawables = drawables;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < drawables.length; i++) {
			drawables[i].draw(g);
		}
	}
}
