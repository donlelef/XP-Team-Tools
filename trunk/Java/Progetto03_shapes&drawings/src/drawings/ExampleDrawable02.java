package drawings;

import java.awt.Graphics;

public class ExampleDrawable02 implements Drawable{

	@Override
	public void draw(Graphics g) {
		g.drawOval(100, 100, 100, 100);
		
	}
}
