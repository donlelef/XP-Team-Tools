package model.fileWriting;

import model.Event;

public class SampleFormatter implements IFormatter {
	
	private Event event;
	
	@Override
	public String format(Object object) {
		this.event = (Event) object;
		String line = event.getCountry()+ ", " + event.getDate() + ", " + event.getEvent();
		return line;
	}
	

}
