package tests;

import timeRace.IOperation;
import timeRace.operations.AddIntegerToArraylist;

public class OperationTest01 {
	
	public static void main(String[] args) {
		
		int[] testValues = {0,2,1,2,1,32,13,9,453,5,345,4,645,6,34,21,4,65,7,86,86};
		
		IOperation addInteger = new AddIntegerToArraylist();
		addInteger.initializeData(testValues);
		
		System.out.println(addInteger.toString());
		
		addInteger.doOperation();
		
		addInteger.debug();
		
	}

}
