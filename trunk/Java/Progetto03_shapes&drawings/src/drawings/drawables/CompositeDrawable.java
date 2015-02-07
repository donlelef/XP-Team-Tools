package drawings.drawables;

import java.awt.Graphics;

import drawings.Drawable;

public class CompositeDrawable implements Drawable { // It is an open-closed
														// class. I can add new
														// istances of different
														// classes without
														// changing the code

	private Drawable[] drawables;

	public CompositeDrawable(Drawable... drawables) { // If I use three dots in the declaration, I can pass a series of variables instead of an array 
		super();
		this.drawables = drawables;
	}

	@Override
	public void draw(Graphics g) {
		for (int i = 0; i < drawables.length; i++) {
			drawables[i].draw(g);
		}

	}

}
