package model;

import java.util.Observable;
/**
 * The class performs the calculation required using one 
 * of the {@link IOperation} method. 
 * @author lele
 *
 */
public class Calculator extends Observable{
	
	private IOperation operation;
	private ILineInterpreter interpreter;
	
	public Calculator(IOperation operation, ILineInterpreter interpreter) {
		super();
		this.operation = operation;
		this.interpreter = interpreter;
	}

	private void imChanged(){
		super.setChanged();
		super.notifyObservers();
	}
	
	/**
	 * Perform the computation
	 * @throws Exception 
	 * @param the expression to compute
	 */
	public void operate(String expression) throws Exception {
		int[] operands = this.interpreter.getOperands(expression);
		this.operation.operate(operands);
		imChanged();
	}
	
	/**
	 * It returns a string with the result. 
	 * @return the result formatted
	 */
	public String printResult(){
		return this.operation.toString();
	}
	
	public void setInterpreter(ILineInterpreter interpreter) {
		this.interpreter = interpreter;
	}
}
