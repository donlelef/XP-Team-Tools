package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import model.EventSet;
import model.PossibleCountries;
import model.filters.CountryFilter;
import model.filters.NoFilter;

public class FilterMenu extends JMenu{
	
	private static final long serialVersionUID = 1L;
	private EventSet set;
	
	public FilterMenu(EventSet set) {
		super("Filters");
		this.set = set;
		this.buildFilterMenu();
	}

	private void buildFilterMenu() {
		JMenuItem noFilter = new JMenuItem("None");
		noFilter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				set.setFilter(new NoFilter());
			}
		});
		this.add(noFilter);
		
		for (int i = 0; i < PossibleCountries.values().length; i++) {
			final String name = PossibleCountries.values()[i].getName();
			JMenuItem item = new JMenuItem(name);
			item.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					set.setFilter(new CountryFilter(name));					
				}
			});
			this.add(item);
		}
	}
}
