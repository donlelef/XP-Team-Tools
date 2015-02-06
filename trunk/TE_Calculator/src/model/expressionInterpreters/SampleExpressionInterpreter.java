package model.expressionInterpreters;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import model.ILineInterpreter;

public class SampleExpressionInterpreter implements ILineInterpreter{
	
	private final String[] ammittedSymbols = {"+", "-", "*", "/"};
	private int[] operands = new int[2];
	
	@Override
	public int[] getOperands(String toBeParsed) throws Exception {
		StringTokenizer tokenizer = new StringTokenizer(toBeParsed, " ");
		
		String tmp = tokenizer.nextToken();
		operands[0] = parseOperand(tokenizer, tmp);
		this.verifySymbol(tokenizer.nextToken());
		
		tmp = tokenizer.nextToken();
		operands[1] = parseOperand(tokenizer,tmp);
		
		this.verifyLength(tokenizer);
		
		return operands;
	}


	private void verifyLength(StringTokenizer tokenizer) throws Exception {
		
		String tmp = null;
		try {
			tmp = tokenizer.nextToken();
		} catch (NoSuchElementException e) {
			// Everything is good
		}
		if (tmp != null) {
			throw new Exception("Not a valid expression");
		}
	}


	private int parseOperand(StringTokenizer tokenizer, String tmp) {
		int operand;
		if(this.verifyMinus(tmp)){
			operand= - Integer.parseInt(tokenizer.nextToken());
		} else {
			operand = Integer.parseInt(tmp);
		}
		return operand;
	}


	private boolean verifyMinus(String toBeVerified) {
		if (toBeVerified.charAt(0)=='-') {
			return true;
		} else {
			return false;
		}
	}

	private void verifySymbol(String toBeVerified) throws Exception {
		for (int i = 0; i < ammittedSymbols.length; i++) {
			if (toBeVerified.compareToIgnoreCase(ammittedSymbols[i])==0) {
				return;
			}
		}
		throw new Exception("Symbol not ammitted");
	}
	

}
