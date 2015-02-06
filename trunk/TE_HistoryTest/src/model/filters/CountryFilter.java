package model.filters;

import model.Event;
import model.IEventFilter;

/**
 * A filter for the country of an event
 * 
 * @author lele
 *
 */
public class CountryFilter implements IEventFilter {

	private String key;

	public CountryFilter(String key) {
		super();
		this.key = key;
	}

	@Override
	public boolean filter(Event event) {
		if (event.getCountry().compareToIgnoreCase(this.key) == 0) {
			return true;
		} else {
			return false;
		}
	}
}
