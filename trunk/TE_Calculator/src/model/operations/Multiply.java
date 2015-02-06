package model.operations;

import model.IOperation;

public class Multiply implements IOperation {

	private int result;

	@Override
	public int[] operate(int[] operands) {
		this.result = operands[0] * operands[1];
		int[] results = { this.result };
		return results;
	}

	@Override
	public String toString() {
		return "" + this.result;
	}

}
