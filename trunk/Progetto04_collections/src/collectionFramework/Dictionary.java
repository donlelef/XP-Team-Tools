package collectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Dictionary {

	public static void main(String[] args) {

		Map<String, String> dictionary = new HashMap<String, String>();

		dictionary.put("Ciao", "Hello");
		dictionary.put("Mondo", "World");
		dictionary.put("Pioggia", "Rain");
		dictionary.put("Freddo", "Cold");
		dictionary.put("Triste", "Sad");

		Set<String> keys = dictionary.keySet();
		
		Set<String> orderedkeys = new TreeSet<String>();
		
		orderedkeys.addAll(keys);
		
//		for (String string : orderedkeys) {
//			orderedkeys.add(string);
//		}
	
		for (String key : orderedkeys) {
			String value = dictionary.get(key);

			System.out.println(key + " si dice " + value);
		}

	}
}