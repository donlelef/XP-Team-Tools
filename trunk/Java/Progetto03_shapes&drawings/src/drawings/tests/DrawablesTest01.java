package drawings.tests;

import drawings.DrawingsFrame;
import drawings.drawables.Circle;
import drawings.drawables.Rectangle;

public class DrawablesTest01 {

	public static void main(String[] args) {

		DrawingsFrame frame = new DrawingsFrame(new Rectangle(10, 10, 100, 100));
		frame.launchFrame();

		DrawingsFrame frame2 = new DrawingsFrame(new Circle(100, 100, 50));
		frame2.launchFrame();

	}

}
