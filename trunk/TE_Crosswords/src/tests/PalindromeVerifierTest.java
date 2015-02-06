package tests;

import verification.InvalidFormatExeption;
import verification.PalindromeVerifier;

public class PalindromeVerifierTest {

	public static void main(String[] args) {

		String string01 = "Adda";

		PalindromeVerifier parVerifier = new PalindromeVerifier(string01);
		try {
			System.out.println(parVerifier.verify());
		} catch (InvalidFormatExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
