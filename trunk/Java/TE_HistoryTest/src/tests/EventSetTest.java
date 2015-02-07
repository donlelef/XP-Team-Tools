package tests;

import model.Event;
import model.EventSet;
import model.IEventFilter;
import model.InvalidCountyException;
import model.filters.CountryFilter;
import model.filters.NoFilter;

public class EventSetTest {
	
	public static void main(String[] args) {
		
		EventSet set = new EventSet();
		IEventFilter filter = new NoFilter();
		set.setFilter(filter);
		
		Event event1;
		try {
			event1 = new Event("Carl", 800, "Spagna");
			set.addEvent(event1);
		} catch (InvalidCountyException e3) {
			e3.printStackTrace();
		}
		Event event2;
		try {
			event2 = new Event("Gigio", 800, "Olanda");
			set.addEvent(event2);
		} catch (InvalidCountyException e2) {
			e2.printStackTrace();
		}
		Event event3;
		try {
			event3 = new Event("Carlo", 800, "Spagna");
			set.addEvent(event3);
		} catch (InvalidCountyException e1) {
			e1.printStackTrace();
		}
		Event event4;
		try {
			event4 = new Event("Adolf", 1933, "Germania");
			set.addEvent(event4);
		} catch (InvalidCountyException e) {
			e.printStackTrace();
		}
		
		System.out.println("Primo giro:");
		for (Event event : set.getFilteredSet()) {
			System.out.println(event.toString());			
		}
		
		set.setFilter(new CountryFilter("Germania"));
		System.out.println("Secondo giro:");
		for (Event event : set.getFilteredSet()) {
			System.out.println(event.toString());			
		}
	}

}
