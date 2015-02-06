package model;

/**
 * The exception thrown when an invalid country (i.e. one which is not in the given list)
 * is inserted in an event. 
 * @author lele
 *
 */
public class InvalidCountyException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public InvalidCountyException() {
		super("Invalid Country: retry.");
	}

}
