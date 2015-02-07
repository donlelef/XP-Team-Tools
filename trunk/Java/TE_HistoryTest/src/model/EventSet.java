package model;

import java.util.ArrayList;
import java.util.Observable;
import java.util.SortedSet;
import java.util.TreeSet;
/**
 * This class manage a set of {@link Event}. It extends {@link Observable},
 * so that every change to the set will notify the observers.
 * 
 * @author lele
 *
 */
public class EventSet extends Observable{
	
	private IEventFilter filter;
	private SortedSet<Event> eventSet = new TreeSet<Event>();
	
	private void imchanged() {
		this.setChanged();
		this.notifyObservers();
	}
	/**
	 * It adds an {@link Event} to the set.
	 * @param the {@link Event} to be added.
	 */
	public void addEvent(Event toBeAdded){
		this.eventSet.add(toBeAdded);
		this.imchanged();
	}
	
	/**
	 * It sets the filer and performs filtering. 
	 * @param the {@link IEventFilter} to be used  
	 */
	public void setFilter(IEventFilter filter) {
		this.filter = filter;
		imchanged();
	}

	/**
	 * Clears the set.
	 */
	public void clear(){
		this.eventSet.clear();
		imchanged();
	}
	
	/**
	 * It builds and returns the list of events filtered with 
	 * the currently selected filter.
	 * @return filtered list
	 */
	public ArrayList<Event> getFilteredSet(){
		ArrayList<Event> list = new ArrayList<Event>();
		for (Event event : eventSet) {
			if (filter.filter(event)) {
				list.add(event);
			}
		}
		return list;
	}
	
	/**
	 * 
	 * @return the set of {@link Event}
	 */
	public SortedSet<Event> getEventSet() {
		return eventSet;
	}
}
