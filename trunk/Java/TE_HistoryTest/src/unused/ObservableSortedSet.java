package unused;

import java.util.Observable;
import java.util.Observer;
import java.util.SortedSet;

/**
 * A class which encapsulate a sorted set providing
 * {@link Observable} behavior. Every change to the set will notify 
 * the {@link Observer}. 
 * @author lele
 *
 * @param <T> type of the encapsulated sorted set.
 */
public class ObservableSortedSet <T> extends Observable{
	
	private SortedSet<T> set;
	
	public ObservableSortedSet(SortedSet<T> sortedSet) {
		super();
		this.set = sortedSet;
	}
	
	public SortedSet<T> getSet() {
		return set;
	}
	
	public void setSet(SortedSet<T> set) {
		this.set = set;
		this.setChanged();
		this.notifyObservers();
	}
	
	public void add(T toBeAdded){
		this.set.add(toBeAdded);
		this.setChanged();
		this.notifyObservers();
	}
	
	public void clear(){
		this.set.clear();
		this.setChanged();
		this.notifyObservers();
	}
}
