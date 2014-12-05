package people.uni;

import people.Person;
import utils.time.Date;

public class Student extends Person {

	private int studentID;

	public Student(String name, String surname, Date date, int studentID) {
		super(name, surname, date);
		this.studentID = studentID;
	}
	
	@Override
	public String toString() {
		return super.toString()+"["+studentID+"]";
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	/*@Override	//This is a wild override: previous test will no longer work, 'cause two extensions of people have different behaviors
	public int compareTo(Person other) {
		String surnamei = this.getName();
		String surnamej = other.getName();
		return surnamei.compareTo(surnamej);
	}*/

}
