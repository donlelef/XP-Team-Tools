package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import model.StringList;

public class StringTotalDeleter extends JButton {

	private StringList StringToBeDeleted;
	private JTextField field;

	public StringTotalDeleter(StringList stringListToBeDeleted, JTextField field) {
		super("Delete All Strings >>");
		this.StringToBeDeleted = stringListToBeDeleted;
		this.field = field;
	}

	public void control() {
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				StringToBeDeleted.clearAll();
				field.setText("Type here ...");
				field.repaint();
			}
		});
	}
}
