package tests;

import tests.testClasses.Attraction;
import model.CentralSystem;
import model.IPass;
import model.passes.APass;
import model.passes.BPass;
import model.passes.CPass;

public class CentralSystemTest {
	
	public static void main(String[] args) {
	
		CentralSystem sys = new CentralSystem();
		
		Attraction raptor = new Attraction("Raptor", sys);
		sys.addAttraction(raptor.getId());
		IPass aPass = new APass();
		sys.addPass(aPass);
		IPass bPass = new BPass(sys.getAttractionsSet());
		sys.addPass(bPass);
		IPass cPass = new CPass();
		sys.addPass(cPass);
		
		sys.usePassAt(raptor.getId(), "1");
		System.out.println(sys.getEntranceLeftAt(raptor.getId(), "1"));		
	}
}
