package tests.wrappers;

import tests.dispositivi.FrigoDiTest;
import dispositivi.Dispositivo;

public class FrigoDiTestAdapter implements Dispositivo{

	private FrigoDiTest frigo;
	
	public FrigoDiTestAdapter(FrigoDiTest frigo) {
		super();
		this.frigo = frigo;
	}

	@Override
	public void accendi() {
		frigo.setAcceso(true);
	}
	
	@Override
	public void spegni() {
		frigo.setAcceso(false);
	}
}
