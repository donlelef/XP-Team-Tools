package model;

/**
 * An interface for the tools which will be used in the editor.
 * Every tool operates on one or more pixels of an icon.
 * @author lele
 *
 */
public interface ITool {
	
	/**
	 * Perform the specific operation on one or more pixels of the icon.
	 */
	public void operate(int xPixel, int yPixel);

}
