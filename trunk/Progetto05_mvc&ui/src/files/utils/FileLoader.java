package files.utils;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileLoader {

	private String fileName;
	private ILineLoader lineLoader;
	
	public FileLoader(String fileName, ILineLoader lineLoader) {
		super();
		this.fileName = fileName;
		this.lineLoader = lineLoader;
	}

	public void loadFile() {
		try {
			BufferedReader reader=new BufferedReader(
					new FileReader(new File(fileName)));
			
			String line=reader.readLine();
			while(line!=null){
				lineLoader.loadLine(line);
				line=reader.readLine();
			}
			
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

// Si crea un pacchetto specifico per gli elementi riutilizzabili in ossequio al principio di inversione delle dipendernze.
// Tutti i componenti che dipendono da questi, si attaccheranno all'interfaccia e non alla classe concreta.
