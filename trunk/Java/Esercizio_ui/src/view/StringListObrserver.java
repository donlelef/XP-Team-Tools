package view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextArea;

import model.StringList;

public class StringListObrserver extends JTextArea implements Observer {

	private StringList list = new StringList();

	public StringListObrserver(StringList list) {
		super();
		this.list = list;
		list.addObserver(this);
	}

	public void insertList() {
		for (int i = 0; i < list.getSize(); i++) {
			this.insert(list.getString(i)+"\n", this.getCaretPosition());
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		this.setText("");
		this.insertList();
	}

}
