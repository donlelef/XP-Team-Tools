package files.people;

import java.util.ArrayList;
import java.util.Collections;

import people.Person;
import files.utils.FileLoader;
import files.utils.ILineLoader;

public class PeopleFileTest {

	public static void main(String[] args) {
		
		ArrayList<Person> allPeople=new ArrayList<Person>();
		
		ILineLoader lineLoader = new PeopleBuilder(allPeople);
		
		FileLoader peopleLoader=new FileLoader("people/input.txt", lineLoader);
		
		peopleLoader.loadFile();
		
		Collections.sort(allPeople);
		
		for (Person person : allPeople) {
			System.out.println(person);
		}
	}
	
}
