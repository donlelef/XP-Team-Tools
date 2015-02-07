package drawings.drawables;

import java.awt.Color;
import java.awt.Graphics;

import drawings.Drawable;

public class ColoredDrawable implements Drawable {

	private Drawable drawable;
	private Color color;

	public ColoredDrawable(Drawable drawable, Color color) {
		super();
		this.drawable = drawable;
		this.color = color;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		drawable.draw(g);
	}
}
