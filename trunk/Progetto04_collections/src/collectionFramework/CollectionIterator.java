package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionIterator {

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
		
		System.out.println("Primo caso:");
		
		Iterator<String> iterator = stringsList.iterator();  // Si istanzia l'iteratore della specifica collezione
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);			
		}
		
		System.out.println("Secondo caso:");
		
		for (String string : stringsList) { // Si usa il costrutto foreach
			System.out.println(string);
		}			
		
		System.out.println("Terzo caso:");
		
		for (int i = 0; i < stringsList.size(); i++) {
			System.out.println(stringsList.get(i));
		}
		
	}

}
