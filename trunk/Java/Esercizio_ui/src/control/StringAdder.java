package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import model.StringList;

public class StringAdder extends JButton {

	private StringList StringToBeadded;
	private JTextField field;

	public StringAdder(StringList stringListToBeadded, JTextField field) {
		super("Add String >>");
		this.StringToBeadded = stringListToBeadded;
		this.field = field;
	}

	public void control() {
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				StringToBeadded.addString(field.getText());
				field.setText("Type here ...");
				field.repaint();
			}
		});
	}
}
