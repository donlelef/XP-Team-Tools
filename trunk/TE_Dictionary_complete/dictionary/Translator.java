package dictionary;

import java.util.ArrayList;
import java.util.HashMap;

public class Translator implements IDictionary {

	private HashMap<String, String> translatorMap = new HashMap<String, String>() ;
	
	@Override
	public ArrayList<String[]> search(String key) throws StringNotFoundException {
		if (translatorMap.containsKey(key)) {
			ArrayList<String[]> list = new ArrayList<String[]>();
			String[] strings = new String[1];
			strings[0] = translatorMap.get(key);
			list.add(strings );
			return list;
		}
		else {
			throw new StringNotFoundException(key + " currently not available");
		}
	}
	
	/**
	 * 
	 * @return: a map representing the dictionary itself
	 */
	public HashMap<String, String> getTranslatorMap() {
		return translatorMap;
	}

}
