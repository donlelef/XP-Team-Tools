package tests;

import verification.CharVerifier;
import verification.InvalidFormatExeption;
import verification.Logger;
import verification.PalindromeVerifier;
import verification.Verifier;

public class LoggerTest {

	public static void main(String[] args) {

		String string01 = "Adda";
		String string02 = "XyYx";
		
		Verifier verifier = new Verifier();
		Logger logger = new Logger(verifier);
		verifier.setVerifier(new PalindromeVerifier(string01));
		logger.setVerifier(verifier);
		try {
			logger.generateLog();
		} catch (InvalidFormatExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(logger.getLog());
		verifier.setVerifier(new CharVerifier(string02));
		logger.setVerifier(verifier);
		try {
			logger.generateLog();
		} catch (InvalidFormatExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(logger.getLog());
		
	}

}
