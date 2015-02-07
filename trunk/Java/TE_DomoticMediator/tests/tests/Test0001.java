package tests;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

import tests.dispositivi.LuceDiTest;
import tests.wrappers.LuceDiTestAdapter;
import dispositivi.Centralina;

public class Test0001 {

	@Test
	public void test01(){
		ArrayList<String> richieste=new ArrayList<String>();
		
		Collections.addAll(richieste, 
				"Luce1 on",
				"Luce2 on",
				"Luce1 off"
		);
		
		ArrayList<String> risposte=new ArrayList<String>();
		
		Collections.addAll(risposte, 
				"Luce1 done",
				"Luce2 done",
				"Luce1 done"
		);
		
		Centralina centralina=new Centralina();
		centralina.registraDispositivo("Luce1", 
				new LuceDiTestAdapter(new LuceDiTest()));
		centralina.registraDispositivo("Luce2", 
				new LuceDiTestAdapter(new LuceDiTest()));
		for (int i=0;i<richieste.size();i++) {
			String risposta=centralina.
					getRisposta(richieste.get(i));
			if(!risposta.equalsIgnoreCase(risposte.get(i))){
				fail(richieste.get(i)+" ha generato "+risposta);
			}
		}
	}
	
	public static void main(String[] args) {
		(new Test0001()).test01();
	}
}
