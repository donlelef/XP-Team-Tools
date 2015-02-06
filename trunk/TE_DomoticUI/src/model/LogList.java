package model;

import java.util.ArrayList;
import java.util.Observable;

public class LogList extends Observable{
	
	private ArrayList<Log> logList = new ArrayList<>();
	private ArrayList<Log> filteredList = new ArrayList<>();
	private IFilter filter;
	
	private void imChanged(){
		super.setChanged();
		super.notifyObservers();
	}
	
	public void setFilter(IFilter filter) {
		this.filter = filter;
		filter.filter();
	}
		
	public void add(Log log){
		this.logList.add(log);
		filter.filter();
		this.imChanged();
	}
	
	public void clear() {
		this.logList.clear();
		this.logList.clear();
		imChanged();
	}
	
	public ArrayList<Log> getFilteredList() {
		return filteredList;
	}
	
	public ArrayList<Log> getLogList() {
		return logList;
	}
	
	public void setFilteredList(ArrayList<Log> filteredList) {
		this.filteredList = filteredList;
		imChanged();
	}
}
