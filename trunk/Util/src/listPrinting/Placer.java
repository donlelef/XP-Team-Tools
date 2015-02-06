package listPrinting;

/**
 * This interface represents any placer, which means an object that can properly
 * dispose a certain set of elements in a 2D space
 * 
 * @author simone
 *
 */
public interface Placer {

	/**
	 * Returns the x coordinate for that item
	 * 
	 * @param itemPosition
	 *            : the item position in the set
	 * @return: the x coordinate
	 */
	public int getX(int itemPosition);

	/**
	 * Returns the y coordinate for that item
	 * 
	 * @param itemPosition
	 *            : the item position in the set
	 * @return: the y coordinate
	 */
	public int getY(int itemPosition);

	/**
	 * Returns the item position that an element at (x,y) should have in the set
	 * 
	 * @param x
	 *            : the x of that element
	 * @param y
	 *            : the y of that element
	 * @return: the position in the set
	 */
	public int getItemPosition(int x, int y);
}
