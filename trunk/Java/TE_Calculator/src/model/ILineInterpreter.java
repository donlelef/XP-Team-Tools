package model;

/**
 * Implementors should read a mathematical expression 
 * and translate it into a vector of numbers. If the syntax
 * of the expression is incorrect, an exception is thrown.
 * @author lele
 *
 */
public interface ILineInterpreter {
	
	/**
	 * 
	 * @return the operands
	 * @throws Exception if the format is not correct
	 */
	public int[] getOperands(String toBeParsed) throws Exception; 

}
