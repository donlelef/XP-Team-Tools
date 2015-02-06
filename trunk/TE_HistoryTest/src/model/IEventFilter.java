package model;


/**
 * Every filter which works on an {@link Event} should refer to this interface.
 * Every filter is assumed to be passed the event it has to decide whether to keep or not.
 * @author lele
 *
 */
public interface IEventFilter {
	/**
	 * performs filtering
	 */
	public boolean filter(Event event);

}
