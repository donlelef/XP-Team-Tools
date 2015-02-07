package beings;

import java.util.Date;

public class Alien extends Person {

	public Alien(String name, Date birthday) {
		super(name, birthday);
	}

	@Override
	public int getAge(Date date) {
		return (int) (super.getAge(date) * (4f / 5f));
	}

}
