package model.fileWriting;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import model.Event;
import model.EventSet;

public class FileLogger {
	
	private File file;
	private IFormatter formatter;
	private EventSet events;
	
	public FileLogger(String pathName, IFormatter formatter, EventSet events) {
		super();
		this.file = new File(pathName);
		this.events = events;
		this.formatter = formatter;
	}
	
	public void writeFile() throws IOException{
		FileWriter writer = new FileWriter(file, true);
		for (Event event : events.getEventSet()) {
			String line = formatter.format(event) + "\n" ;
			writer.write(line);
		}
		writer.close();
	}
	
	

}
