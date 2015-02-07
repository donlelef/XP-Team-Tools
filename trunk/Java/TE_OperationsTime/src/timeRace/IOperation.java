package timeRace;

import timeRace.operations.AddIntegerToArraylist;
import timeRace.operations.AddIntegerToLinkedlist;

/**
 * The interface represent one of the possible operation to perform. Every concrete implementor
 * is given a vector of random integer values and is assumed to translate it into a proper set of 
 * data.
 * @author lele
 * @since 1.0
 * @version 1.1
 * @see {@link AddIntegerToLinkedlist} {@link AddIntegerToArraylist}
 */
public interface IOperation {
	
	/**
	 * Implements the operations to translate a random vector of integer
	 * to suitable data. It may not make any change if it is not required.
	 */
	public void initializeData(int[] randomValues);
	
	/**
	 * Performs the required operation.
	 * @since 1.0
	 * @
	 */
	public void doOperation();
	
	/**
	 * Returns the description of the operation performed by the concrete implementor
	 * @since 1.0
	 * @return the name of the operation performed
	 */
	
	public String toString();
	
	/**
	 * Displays the content of the concrete implementor's attributes. For debug purpose only.
	 * @since 1.1
	 */
	public void debug();

}
