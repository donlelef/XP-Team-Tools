package view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import control.FileChecker;
import model.LogList;
import model.filters.NoFilter;
import model.loading.FileLoader;
import model.loading.interpreters.LogInterpreter;

public class MainFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private LogList list = new LogList();
	private FileLoader loader = new FileLoader(new LogInterpreter(list), "input.txt");
	private FileChecker checker = new FileChecker(3000, list, loader);
	private ListViewer viewer = new ListViewer(list);
	
	public MainFrame() {
		super("DomoticUI viewer");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		this.getContentPane().add(viewer);
		this.list.setFilter(new NoFilter(list));
		JScrollPane pane = new JScrollPane(viewer);
		this.add(pane);
		this.setJMenuBar(new MainMenuBar(list));
	}
	
	public void launch() {
		this.setVisible(true);
	}
}
