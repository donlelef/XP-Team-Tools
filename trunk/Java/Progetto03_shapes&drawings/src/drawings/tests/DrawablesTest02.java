package drawings.tests;

import drawings.Drawable;
import drawings.DrawingsFrame;
import drawings.drawables.Circle;
import drawings.drawables.CompositeDrawable;
import drawings.drawables.Rectangle;

public class DrawablesTest02 {

	public static void main(String[] args) {

		DrawingsFrame frame = new DrawingsFrame(new CompositeDrawable(
				new Rectangle(110, 10, 50, 50), new Circle(200, 200, 50)));
		frame.launchFrame();

		Drawable[] drawables = { new Rectangle(110, 10, 50, 50),
				new Circle(200, 200, 50) };

		DrawingsFrame frame2 = new DrawingsFrame(new CompositeDrawable(
				drawables));
		frame2.launchFrame();

	}

}
