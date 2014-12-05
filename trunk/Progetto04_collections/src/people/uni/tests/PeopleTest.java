package people.uni.tests;

import people.People;
import people.Person;
import people.uni.Student;
import people.uni.Teacher;
import utils.time.Date;

public class PeopleTest {
	
	public static void main(String[] args) {									// Main function contains 3 different blocks of code 
		
		Person[] persons = new Person[5];
		persons[0] = new Student("Marco", "Bianchi", new Date(1,1,2014),0);			// Class attribute is an object itself
		persons[1] = new Student("Anna", "Rossi", new Date(1,1,2014),1);
		persons[2] = new Student("Giovanni", "Verdi", new Date(1,1,2014),2);
		persons[3] = new Teacher("Luca", "Neri", new Date(1,1,2014), "Analisi");
		persons[4] = new Teacher("Davide", "Bruni", new Date(1,1,2014), "Fisica");
		
		People people = new People();
		people.setPeople(persons);
		people.order();													//I'm calling a method
		
		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i]);		// It displays the ordered list of people. It is not necessary to use .toString method because JVM knows it has to meke the conversion
		}
		
	}
}
