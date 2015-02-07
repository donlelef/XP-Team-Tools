package tests;

import model.IOperation;
import model.operations.Divide;
import model.operations.Multiply;
import model.operations.Subtract;
import model.operations.Sum;

public class OperationsTest {

	public static void main(String[] args) {
		
		int[] operands = {1, 2};

		IOperation sum = new Sum();
		System.out.println(sum.operate(operands)[0]);
		System.out.println(sum.toString());
		
		IOperation diff = new Subtract();
		System.out.println(diff.operate(operands)[0]);
		System.out.println(diff.toString());
		
		IOperation mult = new Multiply();
		System.out.println(mult.operate(operands)[0]);
		System.out.println(mult.toString());
		
		IOperation div = new Divide();
		System.out.println(div.operate(operands)[0]+ " "+div.operate(operands)[1]);
		System.out.println(div.toString());
		
		
	}
}
