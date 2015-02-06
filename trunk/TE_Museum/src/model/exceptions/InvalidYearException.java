package model.exceptions;

public class InvalidYearException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public InvalidYearException(int invalidYear) {
		super(invalidYear + " is not in the range.");
	}

}
