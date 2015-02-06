package tests;

import java.util.TreeSet;

import tests.testClasses.Attraction;
import model.IPass;
import model.passes.APass;
import model.passes.BPass;
import model.passes.CPass;

public class AttractionCounterTest {
	
	public static void main(String[] args) {
		
		Attraction raptor = new Attraction("Raptor");
		Attraction rollercoster = new Attraction("Rollercoster");
		
		TreeSet<String> attractions = new TreeSet<String>();
		attractions.add(raptor.getId());
		attractions.add(rollercoster.getId());
		System.out.println("Pass A:");
		IPass pass = new APass();
		raptor.check(pass);
		raptor.check(pass);
		raptor.check(pass);
		
		System.out.println("\nPass B:");
		IPass pass2 = new BPass(attractions);
		raptor.check(pass2);
		rollercoster.check(pass2);
		raptor.check(pass2);
		rollercoster.check(pass2);
		raptor.check(pass2);
		
		
		System.out.println("\nPass C:");
		IPass pass3 = new CPass();
		raptor.check(pass3);
		rollercoster.check(pass3);
		raptor.check(pass3);

	}

}
