package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedSet {

	public static void main(String[] args) {

		List<String> stringsList = new ArrayList<String>();  // List è un'interfaccia; ArrayList è il concrete implementor
		
		stringsList.add("Ciao");
		stringsList.add("Voglio");
		stringsList.add("Andare");
		stringsList.add("a");
		stringsList.add("Casa");
		stringsList.add("Presto");
		stringsList.add("e");
		stringsList.add("Dormire");
		stringsList.add("tanto");
		
		for (String string : stringsList) { // Si usa il costrutto foreach
			System.out.println(string);
		}			
		
		Collections.sort(stringsList);
		
		for (String string : stringsList) { // Si usa il costrutto foreach
			System.out.println(string);
		}
		
	}

}
