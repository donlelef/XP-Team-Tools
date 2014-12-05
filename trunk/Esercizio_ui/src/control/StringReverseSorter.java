package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import model.StringList;

public class StringReverseSorter extends JMenuItem{
	
	private StringList list;
	
	public StringReverseSorter(StringList list) {
		super("Sort Z->A");
		this.list = list;
	}
	
	public void control(){
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				list.reverseSort();
			}
		});
	}

}
