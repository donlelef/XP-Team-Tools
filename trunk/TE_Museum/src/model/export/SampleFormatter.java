package model.export;

import model.Relic;

public class SampleFormatter implements IFormatter {
	
	private Relic relic;
	
	@Override
	public String format(Object object) {
		this.relic = (Relic) object;
		String line = relic.getCode()+", "+relic.getDescription()+", "+relic.getYear()+", "+relic.getRoom();
		return line;
	}
	

}
