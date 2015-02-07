package drawings.tests;

import drawings.DrawingsFrame;
import drawings.stringslist.StringsList_v1;

public class StringsListTest02 {

	public static void main(String[] args) {

		StringsList_v1 stringsList = new StringsList_v1("White", "Red", "Green",
				"Blue");

		stringsList.setIndex(0);
		
		stringsList.up();
		stringsList.up();
		stringsList.up();
		stringsList.up();
		stringsList.up();
		
		DrawingsFrame frame1 = new DrawingsFrame(stringsList);
		frame1.launchFrame();
		
		StringsList_v1 stringsList2 = new StringsList_v1("White", "Red", "Green",
		"Blue");

		stringsList.setIndex(3);
		
		stringsList2.down();
		stringsList2.down();
		stringsList2.down();
		stringsList2.down();
		stringsList2.down();
		
		
		DrawingsFrame frame2 = new DrawingsFrame(stringsList2);
		frame2.launchFrame();

	}

}
