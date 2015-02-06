package timeRace.operations;

import java.util.Arrays;

import timeRace.IOperation;

public class IntegerVectorSorter implements IOperation{
	
	private int[] data;
	private String name = "Sorting a vector with Arrays.sort algorithm";
	
	@Override
	public void debug() {}
	
	@Override
	public void doOperation() {
		Arrays.sort(data);			
	}
	
	@Override
	public void initializeData(int[] randomValues) {
		this.data = randomValues;		
	}
	
	@Override
	public String toString() {
		return this.name;
	}

}
