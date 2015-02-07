package tests;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

import view.EventsPanel;
import control.ActionsMenu;
import control.FilterMenu;
import control.InsertPanel;
import model.EventSet;
import model.filters.NoFilter;

public class FinalTest {
	
	public static void main(String[] args) {
		
		EventSet set = new EventSet();
		set.setFilter(new NoFilter());
		
		JFrame frame = new JFrame("History test");
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(2,1));
		
		JMenuBar menubar = new JMenuBar();
		FilterMenu menu = new FilterMenu(set);
		menubar.add(menu);
		ActionsMenu actions = new ActionsMenu(set);
		menubar.add(actions);
		frame.setJMenuBar(menubar);
		
		InsertPanel insertPanel = new InsertPanel(set);
		frame.getContentPane().add(insertPanel);
		
		EventsPanel eventsPanel = new EventsPanel(set);
		frame.getContentPane().add(eventsPanel);
		
		frame.setVisible(true);
	}
}
