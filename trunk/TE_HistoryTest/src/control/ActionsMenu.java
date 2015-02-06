package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import model.EventSet;
import model.fileWriting.FileLogger;
import model.fileWriting.SampleFormatter;

public class ActionsMenu extends JMenu{
	
	private static final long serialVersionUID = 1L;
	private EventSet set;
	private FileLogger logger;
	
	public ActionsMenu(EventSet set) {
		super("Actions");
		this.set = set;
		this.logger = new FileLogger("prova.txt", new SampleFormatter(), this.set);
		this.buildActionsMenu();
	}

	private void buildActionsMenu() {
		JMenuItem clear = new JMenuItem("Clear");
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				set.clear();				
			}
		});
		this.add(clear);
		
		JMenuItem print = new JMenuItem("Print file");
		print.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					logger.writeFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
			}
		});
		this.add(print);
	}


}
