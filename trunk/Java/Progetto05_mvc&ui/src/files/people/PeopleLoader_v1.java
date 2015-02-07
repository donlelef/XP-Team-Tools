package files.people;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import people.Person;
import utils.time.Date;

public class PeopleLoader_v1 {

	static void loadPeople(ArrayList<Person> allPeople) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File(
					"people/input.txt")));
			
			String line = reader.readLine();
			while (line != null) {
				System.out.println("[" + line + "]");
				addPerson(allPeople, line);
				line = reader.readLine();
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void addPerson(ArrayList<Person> allPeople, String line) {
		StringTokenizer tokenizer = new StringTokenizer(line, " ");
		// tokenizer.hasMoreTokens();
		String name = tokenizer.nextToken();
		String surname = tokenizer.nextToken();
		String date = tokenizer.nextToken();

		String[] dateNumber = date.split("-");

		int day = Integer.parseInt(dateNumber[0]);
		int month = Integer.parseInt(dateNumber[1]);
		int year = Integer.parseInt(dateNumber[2]);

		Person p = new Person(name, surname, new Date(day, month, year));
		allPeople.add(p);
	}
}

//Ci sono due metodi: il primo è concreto e riutilizzaile, il secondo è astratto e molto specifico.
//Si vuole utilizzare Bridge per disaccoppiare il componente meno riutilizzabile dalla lettura del file
//Innanzitutto occorre togliere da loadPeople la dipendenza da Person: questo viene realizzato inserendo un attributo
//e togliendo il modificatore static.
//Poi si cambieranno i nomi e si astrarrà su addPerson
