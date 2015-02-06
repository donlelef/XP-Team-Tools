package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Observable;
import java.util.TreeSet;

public class RelicList extends Observable{
	
	private TreeSet<Relic> set;
	private IRelicFilter filter;
	
	public RelicList(Comparator<Relic> relicComparator) {
		this.set = new TreeSet<Relic>(relicComparator); 
	}
	
	public void add(Relic relic) {
		this.set.add(relic);
		this.imChanged();
	}
	
	public void setFilter(IRelicFilter filter) {
		this.filter = filter;
		imChanged();
	}
	
	public ArrayList<Relic> getFilteredList() {
		ArrayList<Relic> filteredList = new ArrayList<Relic>();
		for (Relic relic : this.set) {
			if(filter.isMatching(relic))
				filteredList.add(relic);
		}
		return filteredList;
	}
	
	private void imChanged(){
		super.setChanged();
		super.notifyObservers();
	}
	
	public TreeSet<Relic> getRelicSet() {
		return set;
	}

}
