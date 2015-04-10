package timeline;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import model.exceptions.InvalidDateException;
import model.exceptions.NoSuchEventException;
import model.exceptions.UnEditableEventException;
import filtering.Filter;

public interface Timeline {

	public int getEventsNumber();

	public void addEvent(Event event) throws InvalidDateException;

	public void deleteEvent(String eventName) throws NoSuchEventException;

	public void moveEvent(String eventName, GregorianCalendar newDate)
			throws UnEditableEventException, NoSuchEventException;

	public Event getEvent(String eventName) throws NoSuchEventException;

	public ArrayList<Event> getEvents(Filter<Event> filter);

}