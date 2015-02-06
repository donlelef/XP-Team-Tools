package export;
/**
 * Implementors must format an object to a string.
 * @author lele
 * @param T: type of the object to be formatted.
 * 
 */
public interface IFormatter<T> {
	
	/**
	 * 
	 * @param genericObject to be formatted
	 * @return a formatted string
	 */
	public String format(T genericObject);

}
