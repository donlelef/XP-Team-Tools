package model;
/**
 * Every implementer performs an operation for the {@link Calculator}
 * @author lele
 *
 */
public interface IOperation {
	
	/**
	 * Performs the operation.
	 * @param the operands for the operation
	 * @return the result of the operation
	 */
	public int[] operate(int[] operands);

}
