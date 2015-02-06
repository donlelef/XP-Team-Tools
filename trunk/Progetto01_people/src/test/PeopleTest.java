package test;

import people.People;
import people.Person;
import utils.time.Date;

public class PeopleTest {
	
	public static void main(String[] args) {									// Main function contains 3 different blocks of code 
		
		Person[] persons = new Person[5];
		persons[0] = new Person("Marco", "Bianchi", new Date(1,1,2014));			// Class attribute is an object itself
		persons[1] = new Person("Anna", "Rossi", new Date(1,1,2014));
		persons[2] = new Person("Giovanni", "Verdi", new Date(1,1,2014));
		persons[3] = new Person("Luca", "Neri", new Date(1,1,2014));
		persons[4] = new Person("Davide", "Bruni", new Date(1,1,2014));
		
		People people = new People();
		people.setPeople(persons);
		people.order();													//I'm calling a method
		
		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i].getName()+" "+persons[i].getSurname());		// It displays the ordered list of people
		}
		
	}
}
