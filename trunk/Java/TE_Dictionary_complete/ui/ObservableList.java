package ui;

import java.util.ArrayList;
import java.util.Observable;

public class ObservableList extends Observable{

	private ArrayList<String[]> list = new ArrayList<String[]>();
	
	public void setList(ArrayList<String[]> list) {
		setChanged();
		notifyObservers();
		System.out.println("db");
		this.list = list;
	}
	
	public ArrayList<String[]> getList() {
		return list;
	}
	
	public void clear() {
		this.list.clear();
		setChanged();
		notifyObservers();
	}
}
