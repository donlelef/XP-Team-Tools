package export;

import java.io.IOException;

/**
 * Implementors of this interface are assumed to let the user
 * export a list of data to a certain destination
 * @author lele
 *
 */
public interface Exporter {
	
	/**
	 * Performs all the operations you need to export data.
	 * @throws IOException: when destination is unreachable.
	 */
	public abstract void export() throws IOException;

}
