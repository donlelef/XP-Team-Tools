package loading;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.Timer;

import model.LogList;
import model.loading.FileLoader;

public class FileChecker {

	private Timer timer;
	private LogList list;
	private FileLoader loader;
	private long lastModified;
	
	public FileChecker(int delay, LogList list, FileLoader loader) {
		super();
		this.timer = new Timer(delay, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					check();
				} catch (IOException e1) {
					e1.printStackTrace(); //TODO
				}				
			}
		});
		timer.start();
		this.list = list;
		this.loader = loader;
	}
	
	private void check() throws IOException {
		long check = loader.getFile().lastModified();
		if(check > this.lastModified){
			this.lastModified = check;
			this.list.clear();
			this.loader.loadFile();
		}
	}
}
