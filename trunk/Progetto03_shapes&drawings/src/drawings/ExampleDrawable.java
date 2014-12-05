package drawings;

import java.awt.Graphics;

public class ExampleDrawable implements Drawable{

	@Override
	public void draw(Graphics g) {
		g.drawOval(100, 100, 100, 100);
		g.drawOval(110, 110, 80, 80);
	}
}
