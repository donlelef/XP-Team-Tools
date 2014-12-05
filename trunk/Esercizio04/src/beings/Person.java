package beings;

import java.util.Date;

public class Person {

	private String name;
	private Date birthday;

	public Person(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@SuppressWarnings("deprecation")
	public int getAge(Date date) {

		if (date.getMonth() == birthday.getMonth()) {
			if (date.getDay() < birthday.getDay()) {
				return date.getYear() - birthday.getYear();
			} else {
				return date.getYear() - birthday.getYear() + 1;
			}
		} else {
			if (date.getMonth() < birthday.getMonth()) {
				return date.getYear() - birthday.getYear();
			} else {
				return date.getYear() - birthday.getYear() + 1;
			}
		}
	}
}