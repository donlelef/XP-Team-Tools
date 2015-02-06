package model.filters;

import java.util.ArrayList;

import model.IFilter;
import model.Log;
import model.LogList;

public class ThemeFilter implements IFilter {
	
private LogList list;
private String key;
	
	public ThemeFilter(LogList list, String key) {
		this.key = key;
		this.list = list;
	}

	@Override
	public void filter() {
		ArrayList<Log> filterdList = new ArrayList<Log>();
		for (Log log : list.getLogList()) {
			if (log.getTheme().compareToIgnoreCase(key)==0) {
				filterdList.add(log);
			}
		}
		this.list.setFilteredList(filterdList);
	}

}
