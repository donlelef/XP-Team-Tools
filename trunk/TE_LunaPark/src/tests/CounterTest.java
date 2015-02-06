package tests;

import tests.testClasses.Attraction;
import tests.testClasses.Counter;
import model.CentralSystem;

public class CounterTest {
	
	public static void main(String[] args) {
		
		CentralSystem sys = new CentralSystem();		
		Counter counter = new Counter(sys);
		Attraction raptor = new Attraction("raptor", sys);
		
	}

}
