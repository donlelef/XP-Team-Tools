package tests.dispositivi.examples;

import javax.swing.JFrame;

import tests.dispositivi.FrigoDiTest;
import tests.dispositivi.LuceDiTest;
import tests.dispositivi.RiscaldamentoDiTest;

public class EsempioUtilizzoDispositivi {

	public static void main(String[] args) {
		
		/*LuceDiTest luce01=*/new LuceDiTest();
		LuceDiTest luce02=new LuceDiTest();
		luce02.spenta();
		luce02.setLocation(400, 100);
		//quando chiudo il pannello della luce2, si chiude anche l'applicazione
		luce02.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FrigoDiTest frigoO1=new FrigoDiTest();
		frigoO1.setAcceso(true);
		frigoO1.setLocation(800, 100);
		
		RiscaldamentoDiTest riscaldamentoDiTest01=new RiscaldamentoDiTest("01",0);
		riscaldamentoDiTest01.setValore(0.35f);
		riscaldamentoDiTest01.setLocation(100, 400);
		
		RiscaldamentoDiTest riscaldamentoDiTest02=new RiscaldamentoDiTest("01",5000);
		riscaldamentoDiTest02.setValore(0.6f);
		riscaldamentoDiTest02.setLocation(400, 400);

		RiscaldamentoDiTest riscaldamentoDiTest03=new RiscaldamentoDiTest("01",0);
		riscaldamentoDiTest03.setValore(0.9f);
		riscaldamentoDiTest03.setLocation(800, 400);
	}
}
