package control;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Event;
import model.EventSet;
import model.InvalidCountyException;

public class InsertPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private EventSet set;
	private JTextField event = new JTextField(50);
	private JTextField date = new JTextField(50);
	private JTextField country = new JTextField(50);
	
	public InsertPanel(EventSet set) {
		super();
		this.set = set;
		this.buildPanel();
	}

	private void buildPanel() {
		this.setSize(300,300);
		this.setLayout(new GridLayout(2,3));
		this.add(event);
		this.add(date);
		this.add(country);
		
		JButton insert = new JButton("Inserisci");
		insert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					set.addEvent(new Event(event.getText(), Integer.parseInt(date.getText()), country.getText()));
				} catch (NumberFormatException e1) {
					date.setText("Invalid year.");
				} catch (InvalidCountyException e1) {
					country.setText("Invalid country.");
				}				
			}
		});
		JPanel buttonPanel = new JPanel();
		buttonPanel.setSize(200, 200);
		buttonPanel.add(insert, BorderLayout.CENTER);
		this.add(buttonPanel);
	}
	
	
	

}
