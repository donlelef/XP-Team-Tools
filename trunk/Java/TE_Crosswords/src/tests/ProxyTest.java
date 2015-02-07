package tests;

import verification.CharVerifier;
import verification.InvalidFormatExeption;
import verification.PalindromeVerifier;
import verification.Verifier;

public class ProxyTest {

	public static void main(String[] args) {

		String string01 = "Adda";

		Verifier verifier = new Verifier();
		verifier.setVerifier(new PalindromeVerifier(string01));
		try {
			System.out.println(verifier.verify());
		} catch (InvalidFormatExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		verifier.setVerifier(new CharVerifier(string01));
		try {
			System.out.println(verifier.verify());
		} catch (InvalidFormatExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
