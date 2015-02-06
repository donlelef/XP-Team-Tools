package main;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import model.RelicList;
import model.comparators.RelicRoomComparator;
import model.export.FileLogger;
import model.export.IFormatter;
import model.export.SampleFormatter;
import model.filters.NoFilter;
import view.ListPanel;
import control.FilterMenu;
import control.InsertPanel;

public class MainFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	private RelicList list;
		
	public void launch(){
		super.setTitle("Museum");
		super.setSize(500, 500);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setResizable(false);
		
		RelicRoomComparator relicComparator = new RelicRoomComparator();
		this.list = new RelicList(relicComparator);
		list.setFilter(new NoFilter());
		IFormatter formatter = new SampleFormatter();
		FileLogger logger = new FileLogger(formatter, list);
		
		JMenuBar menubar = new JMenuBar();
		FilterMenu filters = new FilterMenu(list);
		menubar.add(filters);
		ExportMenu export = new ExportMenu(logger);
		menubar.add(export);
		this.setJMenuBar(menubar);
		
		JPanel mainPanel = new JPanel(new GridLayout(2,1));
		
		InsertPanel insertPanel = new InsertPanel(list);
		mainPanel.add(insertPanel);
		
		ListPanel listPanel = new ListPanel(list);
		JScrollPane listPane = new JScrollPane(listPanel);
		mainPanel.add(listPane);
		
		this.getContentPane().add(mainPanel);
		
		super.setVisible(true);
		
	}
}
