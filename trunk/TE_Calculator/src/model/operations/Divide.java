package model.operations;

import model.IOperation;

public class Divide implements IOperation {

	private int result;
	private int reminder;

	@Override
	public int[] operate(int[] operands) throws ArithmeticException{
		this.result = operands[0] / operands[1];
		this.reminder = operands[0] % operands[1];
		int[] results = { this.result, this.reminder };
		return results;
	}

	@Override
	public String toString() {
		return "" + this.result + "#" + this.reminder;
	}

}
