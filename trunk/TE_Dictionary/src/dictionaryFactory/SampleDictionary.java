package dictionaryFactory;

import java.util.HashMap;

public class SampleDictionary implements IDictionary {

	private HashMap<String, HashMap<String, String>> dicitonaryMap = new HashMap<String, HashMap<String,String>>();

	public HashMap<String, String> search(String toBeSearched) throws StringNotFoundException {
		if (dicitonaryMap.containsKey(toBeSearched))
			return dicitonaryMap.get(toBeSearched);
		else throw new StringNotFoundException("Current dictionary does not contain the selected word");
	}
	
	public HashMap<String, HashMap<String, String>> getDicitonaryMap() {
		return dicitonaryMap;
	}
}
