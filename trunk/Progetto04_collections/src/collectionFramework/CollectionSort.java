package collectionFramework;

import java.util.Set;
import java.util.TreeSet;

public class CollectionSort {

	public static void main(String[] args) {

		Set<String> stringsList = new TreeSet<String>();  // List è un'interfaccia; ArrayList è il concrete implementor
		
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
		
	}

}
