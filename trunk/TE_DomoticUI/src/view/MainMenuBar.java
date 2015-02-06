package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;
import java.util.TreeSet;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import model.Log;
import model.LogList;
import model.filters.ThemeFilter;

public class MainMenuBar extends JMenuBar implements Observer{

	private static final long serialVersionUID = 1L;
	
	private LogList list;
	private String temporaryTheme;
	
	public MainMenuBar(LogList list) {
		super();
		this.list = list;
		list.addObserver(this);
		buildMenuBar();
	}
	
	@Override
	public void update(Observable o, Object arg) {
		this.buildMenuBar();	
	}

	private void buildMenuBar() {
		this.add(this.buildFilterMenu());
	}

	private JMenu buildFilterMenu() {
		JMenu filterMenu = new JMenu("Filter");
		TreeSet<String> themeList = this.getThemeSet(list.getLogList());
		HashSet<JMenuItem> items = new HashSet<JMenuItem>();
		for (String theme : themeList) {
			this.temporaryTheme = theme;
			JMenuItem item = new JMenuItem(this.temporaryTheme);
			item.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					list.setFilter(new ThemeFilter(list, temporaryTheme));					
				}
			});
			items.add(item);
		}
		System.out.println(items.size());
		for (JMenuItem jMenuItem : items) {
			this.add(jMenuItem);
		}
		return filterMenu;
	}

	private TreeSet<String> getThemeSet(ArrayList<Log> logList) {
		TreeSet<String> themeList = new TreeSet<String>();
		for (Log log : logList) {
			themeList.add(log.getTheme());
		}
		return themeList;
	}

}
