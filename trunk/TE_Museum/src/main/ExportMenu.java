package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import model.export.FileLogger;

public class ExportMenu extends JMenu {

	private static final long serialVersionUID = 1L;
	
	private FileLogger logger;

	public ExportMenu(FileLogger logger) {
		super("Export");
		this.logger = logger;
		this.buildMenu();
	}

	private void buildMenu() {
		JMenuItem file = new JMenuItem("File...");
		file.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				chooser.showSaveDialog(null);
				File file = chooser.getSelectedFile();
				try {
					logger.writeFile(file);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		this.add(file);
		
	}
	
	

}
