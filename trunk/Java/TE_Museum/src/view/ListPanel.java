package view;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import model.Relic;
import model.RelicList;

public class ListPanel extends JPanel implements Observer {
	
	
	private static final long serialVersionUID = 1L;
	private RelicList list;
	private JTextArea area = new JTextArea();

	public ListPanel(RelicList list) {
		super();
		this.list = list;
		list.addObserver(this);
		this.buildPanel();
	}
	
	private void buildPanel() {
		super.setLayout(new GridLayout(1, 1));
		this.area.setEditable(false);
		this.area.setText("Here selected relics will appear...");
		this.add(area);
	}

	@Override
	public void update(Observable o, Object arg) {
		
		ArrayList<Relic> relics = list.getFilteredList();
		if (relics.size() > 0) {
			area.setText("Relics: \n");
			for (Relic relic : relics) {
				area.insert(relic.toString() + "\n", area.getCaretPosition());
			}
		} else {
			area.setText("No mathes found.");
		}
		
	}

}
