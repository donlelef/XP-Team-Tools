package test;

import java.util.Date;

import beings.People;
import beings.Person;

public class PeopleTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Person[] persons = { new Person("Pippo", new Date(57, 11, 20)),
				new Person("Pluto", new Date(34, 6, 10)),
				new Person("Anna", new Date(91, 3, 5)),
				new Person("Sara", new Date(85, 3, 11)) };
		
		People people1 = new People(persons);
		People people2 = new People(persons);
		
		System.out.println("Launching test on Persons array");
		
		people1.orderByBirthday();
		people2.orderByAge(new Date(99,11,17));
		
		for (int i = 0; i < people1.getPeople().length; i++) {
			System.out.println(people1.getPeople()[i].getName());			
		}
		
		for (int i = 0; i < people2.getPeople().length; i++) {
			System.out.println(people2.getPeople()[i].getName());			
		}

	}

}
