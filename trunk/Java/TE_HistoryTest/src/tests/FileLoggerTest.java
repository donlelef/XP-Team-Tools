package tests;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import model.Event;
import model.EventSet;
import model.IEventFilter;
import model.InvalidCountyException;
import model.fileWriting.FileLogger;
import model.fileWriting.SampleFormatter;
import model.filters.CountryFilter;
import model.filters.NoFilter;

public class FileLoggerTest {
	
	public static void main(String[] args) throws IOException {
		
		EventSet set = new EventSet();
		IEventFilter filter = new CountryFilter("Germania");
		set.setFilter(filter);
		
		Event event1;
		try {
			event1 = new Event("Carlo", 800, "Spagna");
			set.addEvent(event1);
		} catch (InvalidCountyException e3) {
			e3.printStackTrace();
		}
		Event event2;
		try {
			event2 = new Event("Gigio", 800, "Germania");
			set.addEvent(event2);
		} catch (InvalidCountyException e2) {
			e2.printStackTrace();
		}
		Event event3;
		try {
			event3 = new Event("Carlo", 800, "Germania");
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
		
		FileLogger logger = new FileLogger("prova.txt", new SampleFormatter(), set);
		logger.writeFile();
		
	}

}
