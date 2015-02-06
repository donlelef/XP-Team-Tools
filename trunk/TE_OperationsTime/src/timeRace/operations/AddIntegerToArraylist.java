package timeRace.operations;

import java.util.ArrayList;

import timeRace.IOperation;

/**
 * This class is a concrete implementor of {@link IOperation}. It adds a 
 * variable number of integers to an Arraylist.
 * @author lele
 * @since 1.0
 * @version 1.0
 */
public class AddIntegerToArraylist implements IOperation {
	
	private ArrayList<Integer> list = new ArrayList<Integer>();
	private int[] data;
	private String name = "Adding to an ArrayList";

	@Override
	public void doOperation() {
		
		for (int i = 0; i < data.length; i++) {
			this.list.add(data[i]);
		}
	}
	
	@Override
	public void initializeData(int[] randomValues) {
		this.data = randomValues;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	@Override
	public void debug(){
		for (int i : list) {
			System.out.println(i);
		}
	}

}
