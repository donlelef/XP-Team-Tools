package model.filters;

import model.IFilter;
import model.LogList;

public class NoFilter implements IFilter {
	
	private LogList list;
	
	public NoFilter(LogList list) {
		this.list = list;
	}
	
	@Override
	public void filter() {
		this.list.setFilteredList(this.list.getLogList());
	}

}
