package dictionary;

/**
 * An abstract IDictionary creator
 * 
 * @author simone
 *
 */
public interface IDictionaryCreator {

	/**
	 * Create a generic IDictionary
	 * 
	 * @return: created dictionary
	 */
	public IDictionary create();
	
	/**
	 * Load IDictionary data, no matter what the way
	 */
	public void load();
}
