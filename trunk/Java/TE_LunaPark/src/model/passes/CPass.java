package model.passes;

import model.IPass;

/**
 * An implementation of the {@link IPass} interface: 
 * customer has an unlimited number of entrances
 * for any attraction.
 * @author lele
 *
 */
public class CPass implements IPass {
	
	private int EntriesLeft = 2;
	private String id;
	
	/* (non-Javadoc)
	 * @see model.IPass#used()
	 */
	@Override
	public void usedAt(String id){	}
	
	/* (non-Javadoc)
	 * @see model.IPass#getEntriesLeft()
	 */
	@Override
	public int getEntriesLeft(String id) {
		return EntriesLeft;
	}
	
	@Override
	public String getId() {
		return this.id;
	}
	
	@Override
	public void setId(String id) {
		this.id = id;
	}

}
