package ui;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;

public class InfoLabel extends JLabel implements Observer {

	private ObservableList list;

	public InfoLabel(ObservableList list){
		super();
		this.list = list;
		this.list.addObserver(this);
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		super.setText("matches: "+list.getList().size());

	}

}
