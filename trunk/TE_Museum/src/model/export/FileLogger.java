package model.export;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import model.Relic;
import model.RelicList;

public class FileLogger {
	
	private IFormatter formatter;
	private RelicList relics;
	
	public FileLogger(IFormatter formatter, RelicList relics) {
		super();
		this.relics = relics;
		this.formatter = formatter;
	}
	
	public void writeFile(File file) throws IOException{
		FileWriter writer = new FileWriter(file, true);
		for (Relic relic : relics.getRelicSet()) {
			String line = formatter.format(relic) + "\n" ;
			writer.write(line);
		}
		writer.close();
	}
	
	

}
