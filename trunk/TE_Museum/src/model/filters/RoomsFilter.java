package model.filters;

import model.IRelicFilter;
import model.Relic;

public class RoomsFilter implements IRelicFilter {
	
	private String selectedRoom;
	
	public RoomsFilter(String selectedRoom) {
		super();
		this.selectedRoom = selectedRoom;
	}

	@Override
	public boolean isMatching(Relic relic) {
		if(relic.getRoom().equalsIgnoreCase(this.selectedRoom)){
			return true;
		} else {
			return false;
		}
	}

}
