package tests;

import verification.CharVerifier;
import verification.InvalidFormatExeption;

public class CharVerifierTest {
	
	public static void main(String[] args) {
		
		String string01 = "AnKaraYY";
		
		CharVerifier charVerifier = new CharVerifier(string01);
		try {
			System.out.println(charVerifier.verify());
		} catch (InvalidFormatExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
