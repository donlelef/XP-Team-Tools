package tests;

import model.StringList;

public class ModelTest {
	
	public static void main(String[] args) {
		
		StringList list = new StringList();
		
		list.addString("CIAO");
		list.addString("BAU");
		list.addString("MIAO");
		list.addString("BAUU");
		
		//list.shuffleSort();
		//list.naturalSort();
		list.reverseSort();
		
		for (int i = 0; i < list.getSize(); i++) {
			System.out.println(list.getString(i));			
		}
	}
}
