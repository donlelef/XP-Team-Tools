package dictionary;

import java.util.ArrayList;

/**
 * A generic dictionary
 * 
 * @author simone
 *
 */
public interface IDictionary {

	/**
	 * Search a string in a generic dictionary and returns a list
	 * rapresenting its element; Different dictionaries could have
	 * different lentgth of list element
	 * 
	 * @param key: string to be searched
	 * @return: a list rapresenting dictionary element;
	 * @throws StringNotFoundException: if key has no mapping in the dictionary
	 */
	public ArrayList<String[]> search(String key) throws StringNotFoundException;
}
