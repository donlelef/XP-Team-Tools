package drawings.tests;

import java.awt.Color;

import drawings.DrawingsFrame;
import drawings.drawables.ColoredDrawable;
import drawings.drawables.CompositeDrawable;
import drawings.drawables.Rectangle;

public class DrawablesTest03 {

	public static void main(String[] args) {

		DrawingsFrame frame = new DrawingsFrame(
				new CompositeDrawable(
						new ColoredDrawable(new Rectangle(20, 20, 10, 10), Color.BLUE), 
						new ColoredDrawable(new Rectangle(250, 250, 10, 10), Color.RED),
						new ColoredDrawable(new Rectangle(250, 20, 10, 10), Color.YELLOW),
						new ColoredDrawable(new Rectangle(20, 250, 10, 10), Color.BLACK)));
		frame.launchFrame();
		
	}

}
