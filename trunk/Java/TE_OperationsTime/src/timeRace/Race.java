package timeRace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * The comparison between different operation is assumed to be a race, whose 
 * competitors are the operations themselves. This class manages the race: it 
 * generates a vector of pseudo-random integer and gives it to every operation.
 * Every operation has to translate it to a set of suitable data. Than the race
 * starts: every operation is executed and its duration recorded in a list.
 * The sorted list of result can be taken out of the class.
 * @author lele
 * @see IOperation, {@link OperationRanking}
 * @since 2.0
 * @version 2.1
 */
public class Race {
	
	private ArrayList<IOperation> operationList;
	private ArrayList<OperationRanking> rankingList = new ArrayList<OperationRanking>();
	private int itemNumber;
	private int randomValues[];
	
	/**
	 * The constructor automatically generates the vector of random integers
	 * @param the list of the selected operations
	 * @param the number of items on witch every operation has to work
	 */
	public Race(ArrayList<IOperation> operationList, int itemNumber) {
		super();
		this.operationList = operationList;
		this.itemNumber = itemNumber;
		this.setRandomValues();
	} 

	private void setRandomValues() {
		Random randomizer = new Random(System.nanoTime());
		randomValues = new int[this.itemNumber];
		for (int i = 0; i < randomValues.length; i++) {
			randomValues[i] = randomizer.nextInt();
		}
	}
	
	/**
	 * The main method of the class: let the operation to be executed 
	 * and estimates the time it takes. Results are saved in a list of 
	 * ranking (Operation + time). It must be underlined that the different operation
	 * are executed on the same data set, so that the race is fair.  
	 */
	public void startRace(){
		this.initializeOperations();
		for (IOperation operation : operationList) {
			long duration = getOperationTime(operation);
			OperationRanking ranking = new OperationRanking(operation, duration);
			rankingList.add(ranking);
		}
	}

	private long getOperationTime(IOperation operation) {
		long startingTime = System.nanoTime();
		operation.doOperation();
		long finishingTime = System.nanoTime();
		long duration = finishingTime - startingTime;
		return duration;
	}

	private void initializeOperations() {
		for (IOperation operation : operationList) {
			operation.initializeData(this.randomValues);
		}
	}
	/**
	 * 
	 * @return the sorted list of ranking (Operation + time)
	 */
	public ArrayList<OperationRanking> getRankingList() {
		Collections.sort(this.rankingList);
		return this.rankingList;
	}
}
