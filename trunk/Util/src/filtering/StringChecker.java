package filtering;

/**
 * Simple concrete implementation of {@link Checker}<String>. The check is valid
 * if the string checked is equal to a target one
 * 
 * @author simone
 *
 */
public class StringChecker implements Checker<String> {

	private String targetString;

	/**
	 * Create a new instance of this class
	 * 
	 * @param targetString
	 *            : the target string
	 */
	public StringChecker(String targetString) {
		super();
		this.targetString = targetString;
	}

	@Override
	/*
	 * (non-Javadoc)
	 * @see filtering.Checker#check(java.lang.Object)
	 */
	public boolean check(String tobeChecked) {
		if (tobeChecked.compareTo(targetString) == 0) {
			return true;
		}
		return false;
	}

}
