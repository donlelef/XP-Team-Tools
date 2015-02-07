package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import model.StringList;

public class StringNaturalSorter extends JMenuItem{
	
	private StringList list;
	
	public StringNaturalSorter(StringList list) {
		super("Sort A->Z");
		this.list = list;
	}
	
	public void control(){
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				list.naturalSort();
			}
		});
	}

}
