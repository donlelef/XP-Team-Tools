package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import dictionary.IDictionaryCreator;
import dictionary.StringNotFoundException;

public class SearchButton extends JButton {

	private static final long serialVersionUID = 1L;
	private IDictionaryCreator creator;
	private InputArea area;
	private ObservableList list;
	
	public SearchButton(IDictionaryCreator creator, InputArea area,
			ObservableList list) {
		super("Search");
		this.creator = creator;
		this.area = area;
		this.list = list;
	}
	
	public void listen(){
		super.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e){
				try {
					list.setList(creator.create().search(area.getInputArea().getText()));
				} catch (StringNotFoundException e1) {
					list.clear();
				}
				
			}
		});
	}
}
