package ui;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextArea;

import verification.Logger;

public class FileLogger implements Observer {

	private Logger logger;
	private String fileName;
	private JTextArea errorArea;

	public FileLogger(Logger logger, String fileName, JTextArea errorArea) {
		super();
		this.logger = logger;
		this.fileName = fileName;
		this.errorArea = errorArea;

		this.logger.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {

		try {
			FileWriter writer = new FileWriter(fileName, true);
			writer.write(logger.getLog() + "\n");
			writer.close();
		} catch (IOException e) {
			errorArea.insert("An error occurred in writing file "
					+ this.fileName + ".", errorArea.getCaretPosition());
		}

	}

}
