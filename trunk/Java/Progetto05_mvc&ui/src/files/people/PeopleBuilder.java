package files.people;

import java.util.ArrayList;
import java.util.StringTokenizer;

import files.utils.ILineLoader;

import people.Person;
import utils.time.Date;

public class PeopleBuilder implements ILineLoader {
	
	private ArrayList<Person> allPeople;
	
	public PeopleBuilder(ArrayList<Person> allPeople) {
		super();
		this.allPeople = allPeople;
	}

	/* (non-Javadoc)
	 * @see files.people.IlineLoader#loadLine(java.lang.String)
	 */
	@Override
	public void loadLine(String line) {
		StringTokenizer tokenizer=new StringTokenizer(line," ");
		//tokenizer.hasMoreTokens();
		String name=tokenizer.nextToken();
		String surname=tokenizer.nextToken();
		String date=tokenizer.nextToken();
		
		String[] dateNumber=date.split("-");
		int day=Integer.parseInt(dateNumber[0]);
		int month=Integer.parseInt(dateNumber[1]);
		int year=Integer.parseInt(dateNumber[2]);
		
		Person p=new Person(name, surname, 
				new Date(day, month, year));
		allPeople.add(p);
	}

}
