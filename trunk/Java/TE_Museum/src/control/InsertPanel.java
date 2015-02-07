package control;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Relic;
import model.RelicList;
import model.Rooms;
import model.exceptions.InvalidCodeException;
import model.exceptions.InvalidYearException;

public class InsertPanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private RelicList list;
	private JTextField code = new JTextField(10);
	private JTextField description = new JTextField(10);
	private JTextField year = new JTextField(10);
	private JComboBox<Rooms> rooms;
	
	
	public InsertPanel(RelicList list) {
		super();
		this.list = list;
		this.buildPanel();
	}

	private void buildPanel() {
		
		JPanel fieldsPanel = new JPanel(new GridLayout(4,2));
		
		JLabel codeLabel = new JLabel("Code [A-Z 0-9 only]:");
		fieldsPanel.add(codeLabel);
		fieldsPanel.add(code);
		
		JLabel descLabel = new JLabel("Description:");
		fieldsPanel.add(descLabel);
		fieldsPanel.add(description);
		
		JLabel yearLabel = new JLabel("Year [800 to 1900]:");
		fieldsPanel.add(yearLabel);
		fieldsPanel.add(year);
		
		JLabel roomLabel = new JLabel("Room:");
		fieldsPanel.add(roomLabel);
		rooms = new JComboBox<Rooms>(Rooms.values());
		fieldsPanel.add(rooms);
				
		this.add(fieldsPanel, BorderLayout.CENTER);
		
		JPanel buttonPanel = new JPanel();
		JButton insert = new JButton("Insert Item>>");
		insert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					list.add(new Relic(code.getText(), Integer.parseInt(year.getText()), description.getText(), ((Rooms)rooms.getSelectedItem()).getName()));
				} catch (NumberFormatException | InvalidYearException e1) {
					year.setText(e1.getMessage());
				} catch (InvalidCodeException e2) {
					code.setText(e2.getMessage());
				}				
			}
		});
		buttonPanel.add(insert);
		this.add(buttonPanel, BorderLayout.NORTH);
	}
	
	

}
