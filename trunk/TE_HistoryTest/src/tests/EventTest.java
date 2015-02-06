package tests;

import java.util.TreeSet;

import unused.ObservableSortedSet;
import model.Event;
import model.InvalidCountyException;

public class EventTest {
	
	public static void main(String[] args) {
		
		ObservableSortedSet<Event> set = new ObservableSortedSet<Event>(new TreeSet<Event>());
		
		Event event1;
		try {
			event1 = new Event("Carlo", 800, "Spagna");
			set.add(event1);
		} catch (InvalidCountyException e3) {
			e3.printStackTrace();
		}
		Event event2;
		try {
			event2 = new Event("Gigio", 800, "Germania");
			set.add(event2);
		} catch (InvalidCountyException e2) {
			e2.printStackTrace();
		}
		Event event3;
		try {
			event3 = new Event("Carlo", 800, "Olanda");
			set.add(event3);
		} catch (InvalidCountyException e1) {
			e1.printStackTrace();
		}
		Event event4;
		try {
			event4 = new Event("Adolf", 1933, "Germania");
			set.add(event4);
		} catch (InvalidCountyException e) {
			e.printStackTrace();
		}
				
		for (Event event : set.getSet()) {
			System.out.println(event.toString());			
		}
		
	}

}
