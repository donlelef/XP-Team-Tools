package drawings.tests;

import drawings.DrawingsFrame;
import drawings.stringslist.StringsList_v1;

public class StringsListTest01 {

	public static void main(String[] args) {

		StringsList_v1 stringsList = new StringsList_v1("White", "Red", "Green",
				"Blue");

		stringsList.setIndex(2);

		DrawingsFrame frame = new DrawingsFrame(stringsList);
		frame.launchFrame();

	}

}
