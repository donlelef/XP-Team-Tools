package test;

import java.util.Date;

import beings.Alien;
import beings.People;
import beings.Person;

public class AlienTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Person[] persons = { new Person("Pippo", new Date(56, 3, 14)),
				new Person("Pluto", new Date(34, 6, 10)),
				new Alien("Plutonio", new Date(29, 6, 11)),
				new Alien("Nettunio", new Date(83, 3, 7)),
				new Person("Anna", new Date(91, 3, 19)),
				new Person("Sara", new Date(85, 3, 19)) };

		People people1 = new People(persons);
		People people2 = new People(persons);

		System.out.println("Launching test on Mixed array");

		people1.orderByBirthday();
		people2.orderByAge(new Date(99, 11, 17));
		
		System.out.println("Printing array_1");

		for (int i = 0; i < people1.getPeople().length; i++) {
			System.out.println(people1.getPeople()[i].getName());
		}
		
		System.out.println("Printing array_2");

		for (int i = 0; i < people2.getPeople().length; i++) {
			System.out.println(people2.getPeople()[i].getName());
		}

	}
}


// ??? Perchè cosidera i due array come se fossero la stessa cosa ???
