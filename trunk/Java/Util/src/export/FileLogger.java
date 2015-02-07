package export;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


/**
 * Writes on a file a generic list of objects of type T, formatting them
 * with a generic {@link IFormatter}. It is necessary that the concrete formatter 
 * used works on the same type of this FileLogger.
 * 
 * @author lele
 *
 * @param <T>: the type of the single element in the list
 */
public class FileLogger<T> implements Exporter{
	
	private IFormatter<T> formatter;
	private List<T> list;
	private File file;
	
	/**
	 * 
	 * @param formatter: the {@link IFormatter} used to format a line. 
	 * @param list: the list of objects to be written.
	 * @param file: the file which user wants to write on. 
	 */
	
	public FileLogger(IFormatter<T> formatter, List<T> list, File file) {
		super();
		this.list = list;
		this.formatter = formatter;
		this.file = file;
	}
	
	@Override
	/*
	 * (non-Javadoc)
	 * @see export.Exporter#export()
	 */
	public void export() throws IOException {
		FileWriter writer = new FileWriter(this.file, true);
		for (T genericObject : list) {
			String line = formatter.format(genericObject) + "\n" ;
			writer.write(line);
		}
		writer.close();
	}
	
	

}
