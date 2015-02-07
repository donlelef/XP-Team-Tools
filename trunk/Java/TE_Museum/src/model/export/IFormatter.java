package model.export;
/**
 * Implementors must format an object to a string.
 * @author lele
 *
 */
public interface IFormatter {
	
	public String format(Object object);

}
