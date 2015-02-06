package timeRace.operations;

import java.util.Collections;
import java.util.LinkedList;

import timeRace.IOperation;

public class IntegerCollectionsSort implements IOperation {
	
	private LinkedList<Integer> list = new LinkedList<Integer>();
	private String name = "Sorting with Collections.sort algorithm";

	@Override
	public void initializeData(int[] randomValues) {
		for (int i = 0; i < randomValues.length; i++) {
			this.list.add(randomValues[i]);
		}
	}

	@Override
	public void doOperation() {
		Collections.sort(list);
	}

	@Override
	public void debug() {
		for (Integer element : list) {
			System.out.println(" "+element);
		}
	}
	
	@Override
	public String toString() {
		return this.name;
	}

}
