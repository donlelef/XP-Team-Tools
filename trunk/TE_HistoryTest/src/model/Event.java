package model;


/**
 * An event is composed by its description, its date (year) and the country
 * where it took place. It is assumed to be {@link Comparable} to other events
 * on the following rule: you first look at the date(ascending order), than at
 * the country and finally at the description (alphabetical order).
 * 
 * @author lele
 *
 */
public class Event implements Comparable<Event> {

	private String event;
	private int date;
	private String country;
	
	/**
	 * 
	 * @param description
	 *            of the event
	 * @param date
	 *            (year)
	 * @param country
	 */
	public Event(String event, int date, String country) throws InvalidCountyException{
		super();
		this.event = event;
		this.date = date;
		this.setCountry(country);
	}

	private void setCountry(String country) throws InvalidCountyException{
		boolean found = false;
		for (int i = 0; i < PossibleCountries.values().length; i++) {
			if(country.compareToIgnoreCase(PossibleCountries.values()[i].getName())==0){
				found = true;
			}
		}
		if(found){
			this.country = country;
		} else {
			throw new InvalidCountyException();
		}
	}

	@Override
	public String toString() {
		return this.event + " " + this.date + " " + this.country;
	}

	@Override
	public int compareTo(Event other) {
		if (this.date > other.date) {
			return 1;
		} else if (this.date == other.date) {
			if (this.country.compareToIgnoreCase(other.country) != 0) {
				return this.country.compareToIgnoreCase(other.getCountry());
			} else {
				return this.event.compareToIgnoreCase(other.getEvent());
			}
		} else {
			return -1;
		}
	}

	public int getDate() {
		return date;
	}

	public String getCountry() {
		return country;
	}

	public String getEvent() {
		return event;
	}

}
