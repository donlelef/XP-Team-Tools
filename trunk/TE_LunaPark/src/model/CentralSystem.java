package model;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class CentralSystem {
	
	private TreeSet<String> attractionIds = new TreeSet<String>();
	private HashMap<String, IPass> passes = new HashMap<String, IPass>();
	private int lastId = 0;

	public void addAttraction(String attractionId) {
		attractionIds.add(attractionId);		
	}

	public void addPass(IPass pass) {
		String nextId = this.nextId();
		pass.setId(nextId);
		passes.put(nextId, pass);		
	}

	public Set<String> getAttractionsSet() {
		return this.attractionIds;
	}
	
	public boolean check(String passId, String attractionId) {
		if (this.passes.get(passId).getEntriesLeft(attractionId) > 0) {
			this.usePassAt(attractionId, passId);
			return true;
		} else {
			return false;
		}
	}
	
	private String nextId() {
		this.lastId++;
		return ""+lastId;
	}
	
	/**
	 * DEBUG ONLY
	 */
	public void printPasses(){
		for (IPass pass : passes.values()) {
			System.out.println(pass.getId());
		}
	}

	private void usePassAt(String attractionId, String passId) {
		passes.get(passId).usedAt(attractionId);
	}
}
