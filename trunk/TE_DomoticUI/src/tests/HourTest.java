package tests;

import java.util.ArrayList;
import java.util.Collections;

import model.Hour;

public class HourTest {

	public static void main(String[] args) {
		
		Hour hour = new Hour(25, 65, 70);
		Hour hour1 = new Hour(0, 59, 30);
		ArrayList<Hour> list = new ArrayList<Hour>();
		list.add(hour);
		list.add(hour1);
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
}
