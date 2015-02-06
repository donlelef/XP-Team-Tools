package model.loading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileLoader {

	private ILineInterpreter interpreter;
	private File file;

	public FileLoader(ILineInterpreter interpreter, String pathName) {
		super();
		this.interpreter = interpreter;
		this.file = new File(pathName);
	}
			
	public void loadFile() throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader(file));

		String line;
		while ((line = reader.readLine()) != null) {
			this.interpreter.interpret(line);
		}

		reader.close();
	}
	
	public File getFile() {
		return file;
	}

}
