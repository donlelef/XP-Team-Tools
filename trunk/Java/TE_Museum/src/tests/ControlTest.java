package tests;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

import model.RelicList;
import model.comparators.RelicRoomComparator;
import control.FilterMenu;
import control.InsertPanel;

public class ControlTest {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Museum");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		RelicRoomComparator relicComparator = new RelicRoomComparator();
		RelicList list = new RelicList(relicComparator);
		
		JMenuBar menubar = new JMenuBar();
		FilterMenu filters = new FilterMenu(list);
		menubar.add(filters);
		frame.setJMenuBar(menubar);
		
		InsertPanel insertPanel = new InsertPanel(list);
		frame.getContentPane().add(insertPanel);
		
		frame.setVisible(true);
	}

}
