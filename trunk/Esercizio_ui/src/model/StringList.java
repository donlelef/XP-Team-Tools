package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Observable;

public class StringList extends Observable {

	private ArrayList<String> list = new ArrayList<String>();
	
	private void update() {
		setChanged();
		notifyObservers();
	}

	public void addString(String string) {
		list.add(string);
		update();
	}
	
	public String getString(int index) {
		return list.get(index);		
	}
	
	public int getSize() {
		return list.size();
	}
	
	public void clearAll() {
		list.clear();
		update();
	}
	
	public void naturalSort() {
		Collections.sort(list);
		update();
	}

	public void reverseSort() {
		Collections.sort(list, new ReverseComparator());
		update();
	}
	
	public void shuffleSort() {
		Collections.shuffle(list);
		update();
	}
}
