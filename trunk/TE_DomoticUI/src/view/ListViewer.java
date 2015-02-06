package view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextArea;

import model.Log;
import model.LogList;

public class ListViewer extends JTextArea implements Observer{
	
	private static final long serialVersionUID = 1L;
	
	private LogList list;

	public ListViewer(LogList list) {
		super();
		this.list = list;
		this.setEditable(false);
		this.setText("Here Logs will appear");
		list.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		this.setText("");
		this.printList();
	}

	private void printList() {
		for (Log log : list.getFilteredList()) {
			this.insert(log.toString() + "\n", this.getCaretPosition());
		}		
	}
	
	

}
