package beings;

import java.util.Date;

public class People {

	private Person[] people;

	public People(Person[] people) {
		super();
		this.people = people;
	}

	public void orderByBirthday() {
		for (int i = 0; i < people.length; i++) {
			for (int j = i + 1; j < people.length; j++) {
				if (people[i].getBirthday().compareTo(people[j].getBirthday()) > 0) {
					Person tmp = people[i];
					people[i] = people[j];
					people[j] = tmp;
				}
			}
		}
	}

	public void orderByAge(Date date) {
		for (int i = 0; i < people.length; i++) {
			for (int j = i + 1; j < people.length; j++) {
				if (people[i].getAge(date) < people[j].getAge(date)) {
					Person tmp = people[i];
					people[i] = people[j];
					people[j] = tmp;
				}
			}
		}
	}

	public Person[] getPeople() {
		return people;
	}

}
