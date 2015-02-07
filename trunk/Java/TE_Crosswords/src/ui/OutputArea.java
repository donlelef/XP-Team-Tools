package ui;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextArea;

import verification.Logger;

public class OutputArea extends JTextArea implements Observer{

	private static final long serialVersionUID = 1L;
	private Logger logger;

	public OutputArea(Logger logger) {
		super();
		this.logger = logger;
		
		this.setBackground(Color.WHITE);
		this.setEditable(false);
		this.logger.addObserver(this);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		String output = logger.getLog();
		this.insert(output + "\n", getCaretPosition());
	}

}
