package model.comparators;

import java.util.Comparator;

import model.Relic;

public class RelicRoomComparator implements Comparator<Relic> {

	@Override
	public int compare(Relic relic1, Relic relic2) {
		if(relic1.getRoom().compareToIgnoreCase(relic2.getRoom())!=0){
			return relic1.getRoom().compareToIgnoreCase(relic2.getRoom());
		} else {
			if(relic1.getYear()-relic2.getYear()!=0){
				return relic1.getYear()-relic2.getYear();
			} else {
				return relic1.getCode().compareToIgnoreCase(relic2.getCode());
			}
		}
	}

}
