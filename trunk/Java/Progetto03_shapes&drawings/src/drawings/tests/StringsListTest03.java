package drawings.tests;

import javax.swing.JPanel;

import drawings.DrawingsFrame;
import drawings.stringslist.Placer;
import drawings.stringslist.StringsList;
import drawings.stringslist.VerticalPlacer;

public class StringsListTest03 {

	public static void main(String[] args) {

		StringsList stringsList = new StringsList("White", "Red", "Green",
				"Blue");

		stringsList.setIndex(2);
		
		Placer placer = new Placer();
		stringsList.setPlacer(placer);
		placer.setPlacer(new VerticalPlacer());

		DrawingsFrame frame1 = new DrawingsFrame(stringsList);
		frame1.launchFrame();
		
		JPanel panel = frame1.getPanel();
		
		StringsListController controller=new StringsListController(stringsList, placer, panel);
		
		frame1.addKeyListener(controller);

	}

}
