package dictionary;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Multilingue-supporting implementation of IDictionary interface.
 * 
 * @author simone
 *
 */
public class MultilingueDictionary implements IDictionary {

	private HashMap<String, HashMap<String, String>> dictionaryMap = new HashMap<String, HashMap<String,String>>() ;
	
	private HashMap<String, String>	getElementMap(String tobeSearched) throws StringNotFoundException{ 
		if (dictionaryMap.containsKey(tobeSearched)) {
			return this.dictionaryMap.get(tobeSearched);
		}
		else {
			throw new StringNotFoundException(tobeSearched+" is currently not available");
		}
	}
	
	/**
	 * 
	 * @return: a map rapresenting the dictionary itself
	 */
	public HashMap<String, HashMap<String, String>> getDictionaryMap() {
		return dictionaryMap;
	}

	@Override
	/*
	 * (non-Javadoc)
	 * @see dictionaryFactory.IDictionary#search(java.lang.String)
	 */
	public ArrayList<String[]> search(String key) throws StringNotFoundException {
		ArrayList<String[]> list = new ArrayList<String[]>();
		for (String string : this.getElementMap(key).keySet()) {
			String[] strings = {string, this.getElementMap(key).get(string)};
			list.add(strings);
		}
		return list;
	}
}

	
