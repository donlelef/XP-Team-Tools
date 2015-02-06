package tests;

import model.Relic;
import model.exceptions.InvalidCodeException;
import model.exceptions.InvalidYearException;

public class RelicTest {
	
	public static void main(String[] args) {
		
		Relic relic1;
		try {
			relic1 = new Relic("ACDE4567", 1989, "Testa del re", "Sala delle scienze moderne");
			System.out.println(relic1.toString());
			
		} catch (InvalidCodeException | InvalidYearException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Relic relic2;
		try {
			relic2 = new Relic("ACD%3567", 1788, "Testa del re", "Sala delle tecnologe moderne");
			System.out.println(relic2.toString());
		} catch (InvalidCodeException | InvalidYearException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Relic relic3;
		try {
			relic3 = new Relic("ACDE8567", 1787, "Testa del re", "Sala dell'inquisizione");
			System.out.println(relic3.toString());
		} catch (InvalidCodeException | InvalidYearException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
