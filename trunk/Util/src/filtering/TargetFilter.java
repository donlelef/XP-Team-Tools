package filtering;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This implementation of {@link Filter} interface supports target check for the
 * collection's element.
 * 
 * @author simone
 *
 * @param <T>: the param of the collection
 */
public class TargetFilter<T> implements Filter<T> {

	private Checker<T> checker;

	/**
	 * Create a new instance of this class
	 * 
	 * @param ckecker
	 *            : the concrete checker that will be used to decide whether or
	 *            not a single T element has to be added to the filtered
	 *            collection
	 */
	public TargetFilter(Checker<T> ckecker) {
		super();
		this.checker = ckecker;
	}

	@Override
	/*
	 * (non-Javadoc)
	 * 
	 * @see filtering.Filter#filter(java.util.Collection)
	 */
	public List<T> filter(List<T> collection) {
		List<T> filteredCollection = new ArrayList<T>();
		for (Iterator<T> iterator = collection.iterator(); iterator.hasNext();) {
			T t = iterator.next();
			if (checker.check(t)) {
				filteredCollection.add(t);
			}
		}
		return (List<T>) filteredCollection;
	}

}
