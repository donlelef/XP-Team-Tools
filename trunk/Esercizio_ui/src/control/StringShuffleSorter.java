package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import model.StringList;

public class StringShuffleSorter extends JMenuItem{
	
	private StringList list;
	
	public StringShuffleSorter(StringList list) {
		super("Randomize");
		this.list = list;
	}
	
	public void control(){
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				list.shuffleSort();
			}
		});
	}

}
