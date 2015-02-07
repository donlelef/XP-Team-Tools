package model.passes;

import model.IPass;

/**
 * An implementation of the {@link IPass} interface: 
 * customer has a fixed number of entrances which may
 * be used for any attraction.
 * @author lele
 *
 */
public class APass implements IPass {
	
	private int EntriesLeft = 2;
	private String id;

	/* (non-Javadoc)
	 * @see model.IPass#used()
	 */
	@Override
	public void usedAt(String id){
		this.EntriesLeft --;
	}
	
	/* (non-Javadoc)
	 * @see model.IPass#getEntriesLeft()
	 */
	@Override
	public int getEntriesLeft(String id) {
		return EntriesLeft;
	}
	
	@Override
	public String getId() {
		return id;
	}
	
	@Override
	public void setId(String id) {
		this.id = id;		
	}

}
