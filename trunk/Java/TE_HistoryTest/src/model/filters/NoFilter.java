package model.filters;

import model.Event;
import model.IEventFilter;

/**
 * A filter which does nothing - ie. returns the set as is.
 * 
 * @author lele
 * @see {@link IEventFilter}
 *
 */
public class NoFilter implements IEventFilter {

	@Override
	public boolean filter(Event event) {
		return true;
	}
}
