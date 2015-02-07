package model.operations;

import model.IOperation;

/**
 * A proxy for {@link IOperation} inferface.
 * @author lele
 *
 */
public class ProxyOperation implements IOperation{
	
	private IOperation operation;
	
	public void setOperation(IOperation operation) {
		this.operation = operation;
	}
	
	@Override
	public int[] operate(int[] operands) {
		return this.operation.operate(operands);
	}
	
	@Override
	public String toString() {
		return this.operation.toString();
	}

}
