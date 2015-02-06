package model.passes;

import java.util.HashMap;
import java.util.Set;

import model.IPass;

/**
 * An implementation of the {@link IPass} interface: 
 * customer has 2 entrances for any single attraction.
 * @author lele
 *
 */
public class BPass implements IPass {
	
	private HashMap<String, Integer> entrancesLeft = new HashMap<String, Integer>();
	private String id;
	
	/**
	 * Create a new instance of the class
	 * @param AttractionsIds: the set of the attraction's ids
	 * @param Id: the identifier of this pass
	 */
	public BPass(Set<String> attractionsIds) {
		super();
		this.initializeEntrancesLeft(attractionsIds);
	}

	private void initializeEntrancesLeft(Set<String> AttractionsIds) {
		for (String id : AttractionsIds) {
			this.entrancesLeft.put(id, 2);
		}
	}

	/* (non-Javadoc)
	 * @see model.IPass#used()
	 */
	@Override
	public void usedAt(String id){
		this.entrancesLeft.put(id, this.getEntriesLeft(id)-1);
	}
	
	/* (non-Javadoc)
	 * @see model.IPass#getEntriesLeft()
	 */
	@Override
	public int getEntriesLeft(String id) {
		return this.entrancesLeft.get(id);
	}

	public String getId() {
		return this.id;
	}
	
	@Override
	public void setId(String id) {
		this.id = id;		
	}

}
