package timeRace.operations;

import java.util.LinkedList;

import timeRace.IOperation;

public class IntegerBubbleSort implements IOperation {
	
	private LinkedList<Integer> list = new LinkedList<Integer>();
	private String name = "Sorting with Bubble sort algorithm";

	@Override
	public void initializeData(int[] randomValues) {
		for (int i = 0; i < randomValues.length; i++) {
			this.list.add(randomValues[i]);
		}
	}

	@Override
	public void doOperation() {
		
		for (int i = 0; i < list.size(); i++) {
			for(int j = i+1; j < list.size(); j++){
				if(list.get(i) > list.get(j)){
					int tmp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, tmp);
				}
			}	
		}
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
