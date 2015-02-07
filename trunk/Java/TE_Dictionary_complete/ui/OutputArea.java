package ui;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextArea;

public class OutputArea extends JTextArea implements Observer {

	private ObservableList list;

	public OutputArea(ObservableList list) {
		super();
		this.list = list;
		this.list.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		super.setText("\n\n\n");
		for (String[] strings : list.getList()) {
			String string = "";
			for (int i = 0; i < strings.length; i++) {
				string+=strings[i]+"\t";
			}
			super.insert(string+"\n", getCaretPosition());
		}
	}

}
