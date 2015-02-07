package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import model.RelicList;
import model.Rooms;
import model.filters.NoFilter;
import model.filters.RoomsFilter;

public class FilterMenu extends JMenu{
	
	private static final long serialVersionUID = 1L;
	
	private RelicList list;

	public FilterMenu(RelicList list) {
		super("Room Filters");
		this.list = list;
		this.buildMenu();
	}

	private void buildMenu() {
		
		JMenuItem noFilter = new JMenuItem("All");
		noFilter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				list.setFilter(new NoFilter());				
			}
		});
		this.add(noFilter);
		
		for (int i = 0; i < Rooms.values().length; i++) {
			final String selectedRoom = Rooms.values()[i].getName();
			JMenuItem item = new JMenuItem(selectedRoom);
			item.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					list.setFilter(new RoomsFilter(selectedRoom));					
				}
			});
			this.add(item);
		}
	}
	
	

}
