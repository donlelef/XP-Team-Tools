package view;

import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import model.Event;
import model.EventSet;

public class EventsPanel extends JPanel implements Observer{

	private static final long serialVersionUID = 1L;
	private EventSet set;
	private JTextArea area = new JTextArea();
	
	public EventsPanel(EventSet set) {
		super();
		this.set = set;
		this.set.addObserver(this);
		this.buildPanel();
	}

	private void buildPanel() {
		this.setLayout(new GridLayout(1,1));
		this.area.setEditable(false);
		this.area.setSize(300, 300);
		this.area.setText("Events will be displayed here.");
		this.add(area);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		this.area.setText("");
		for (Event event : this.set.getFilteredSet()) {
			this.area.append(event.toString() + "\n" );
		}
	}
	

}
