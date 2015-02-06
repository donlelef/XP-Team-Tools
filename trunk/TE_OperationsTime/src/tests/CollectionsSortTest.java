package tests;

import timeRace.IOperation;
import timeRace.operations.IntegerCollectionsSort;

public class CollectionsSortTest {
	
	public static void main(String[] args) {
		
		IOperation collectionsSorter = new IntegerCollectionsSort();
		
		int[] values = {1,564,6,4,876,7,89,87,42,3,24,5,47,65,97,9,0,8,453,13};
		
		collectionsSorter.initializeData(values);
		collectionsSorter.doOperation();
		collectionsSorter.debug();
		
	}

}
