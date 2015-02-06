package tests;

import model.Hour;
import model.Log;

public class LogTest {

	public static void main(String[] args) {
		
		Log log = new Log("Test", new Hour(25, 65, 70), "this is a test");
		System.out.println(log.toString());
	}
}
