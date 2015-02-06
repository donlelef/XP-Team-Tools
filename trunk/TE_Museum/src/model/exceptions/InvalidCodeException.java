package model.exceptions;

public class InvalidCodeException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public InvalidCodeException() {
		super("Invalid code");
	}

}
