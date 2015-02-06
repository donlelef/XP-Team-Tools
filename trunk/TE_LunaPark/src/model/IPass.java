package model;
/**
 * This interface represents any kind of pass. A pass should be able
 * to understand if the owner can access an attraction. Moreover it 
 * is assumed to let the customer check the number of available enterances 
 * left.
 * @author lele
 *
 */
public interface IPass {
	
	/**
	 * When a pass is used in a {@link Attraction}, the 
	 * number of available entries left is decremented
	 * @param id: the identifier of the attraction where the pass is used
	 */
	public abstract void usedAt(String id);
	
	/**
	 * Shows the amount of available entries left
	 * @param id: the identifier of the attraction 
	 * @return the number of entries left for the attraction identified by id.
	 */
	public abstract int getEntriesLeft(String id);
	
	/**
	 * Returns the id of the the pass
	 * @return the id of the pass
	 */
	public abstract String getId();
	
	/**
	 * Sets the ID of the pass
	 */
	public abstract void setId(String id);

}