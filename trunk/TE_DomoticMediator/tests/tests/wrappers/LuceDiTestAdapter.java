package tests.wrappers;

import dispositivi.Dispositivo;
import tests.dispositivi.LuceDiTest;

public class LuceDiTestAdapter implements Dispositivo{

	private LuceDiTest luce;
	
	public LuceDiTestAdapter(LuceDiTest luce) {
		super();
		this.luce = luce;
	}
	@Override
	public void accendi() {
		luce.accendi();
	}
	@Override
	public void spegni() {
		luce.spenta();
	}
}
