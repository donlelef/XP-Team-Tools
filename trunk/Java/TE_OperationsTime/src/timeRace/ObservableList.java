package timeRace;

import java.util.ArrayList;
import java.util.Observable;

/**
 * This class encapsulates an {@link ArrayList} but provides a observable
 * behavior in addition to the whole set of method inherited from
 * {@link ArrayList}
 * 
 * @author lele
 * @since 1.1
 * @version 1.2
 * @param <E>: the param of the {@link ArrayList} encapsulated
 */
public class ObservableList<E> extends Observable{
	
	private ArrayList<E> list;

	public ObservableList(ArrayList<E> list) {
		super();
		this.setList(list);
	}

	public ArrayList<E> getList() {
		return list;
	}

	public void setList(ArrayList<E> list) {
		this.list = list;
		this.setChanged();
		this.notifyObservers();
	}
	
	public void add(E element){
		this.list.add(element);
		this.setChanged();
		this.notifyObservers();
	}
	
	public void clear(){
		this.list.clear();
		this.setChanged();
		this.notifyObservers();
	}
}	