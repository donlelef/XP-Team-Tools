package dictionaryFactory;

import java.util.HashMap;

public interface IDictionary {
	
	public HashMap<String, String> search(String toBeSearched) throws StringNotFoundException;

}
