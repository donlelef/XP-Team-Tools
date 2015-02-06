package model.filters;

import model.IRelicFilter;
import model.Relic;

public class NoFilter implements IRelicFilter {

	@Override
	public boolean isMatching(Relic relic) {
		return true;
	}

}
