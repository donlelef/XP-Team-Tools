package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import verification.InvalidFormatExeption;
import verification.Logger;

public class VerifyButton extends JButton {

	private static final long serialVersionUID = 1L;
	private JTextField inputField;
	private Logger logger;
	private JTextArea errorArea;

	public VerifyButton(JTextField inputField, Logger logger,
			JTextArea errorArea) {
		super("Launch test >>");
		this.inputField = inputField;
		this.logger = logger;
		this.errorArea = errorArea;
	}

	public void doVerify() {

		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					logger.getVerifier().setString(inputField.getText());
					logger.generateLog();
				} catch (NullPointerException e1) {
					errorArea.insert("Please select a test from menu.\n",
							errorArea.getCaretPosition());
				} catch (InvalidFormatExeption e1) {
					errorArea.insert(e1.getMessage()+"\n", errorArea.getCaretPosition());
				}
			}
		});

	}
}
