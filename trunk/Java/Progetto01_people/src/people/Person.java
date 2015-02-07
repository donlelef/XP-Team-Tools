package people;

import utils.time.Date;

public class Person implements Comparable<Person>
{
	public Person(String name, String surname, Date date)				// constructor
	{
		// super();
		this.name = name;
		this.surname = surname;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return name+" "+surname+" "+date;
	}
	
	public String getName() {											// set e get methods
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public int compareTo(Person other){
		String surnamei = this.getSurname();
		String surnamej = other.getSurname();
		return surnamei.compareTo(surnamej);
	}


	private String name;												// attributes - declared as private
	private String surname;
	private Date date;
	
	
}
