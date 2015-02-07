package tests;

import java.util.Comparator;

import model.Relic;
import model.RelicList;
import model.comparators.RelicRoomComparator;
import model.exceptions.InvalidCodeException;
import model.exceptions.InvalidYearException;

public class RelicListTest {
	
	public static void main(String[] args) {
		
		Comparator<Relic> relicComparator = new RelicRoomComparator();
		RelicList list = new RelicList(relicComparator);
		
		Relic relic1;
		try {
			relic1 = new Relic("ACDE4567", 1889, "Testa del re", "Sala delle scienze moderne");
			list.add(relic1);
			
		} catch (InvalidCodeException | InvalidYearException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Relic relic2;
		try {
			relic2 = new Relic("ACDW5567", 1788, "Testa del re", "Sala delle tecnologe moderne");
			list.add(relic2);
		} catch (InvalidCodeException | InvalidYearException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Relic relic3;
		try {
			relic3 = new Relic("ACDE8567", 1787, "Testa del re", "Sala dell'inquisizione");
			list.add(relic3);
		} catch (InvalidCodeException | InvalidYearException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (Relic relic : list.getRelicSet()) {
			System.out.println(relic.toString());
		}
		
	}

}
