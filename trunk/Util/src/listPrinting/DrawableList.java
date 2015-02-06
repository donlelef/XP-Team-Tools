package listPrinting;

import java.awt.Graphics;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * This class is able to draw any string representation of a {@link List}'s
 * elements. The drawing is done referring to a specifical placement, ruled by a
 * {@link Placer} istance. It extends {@link Observable} superclass to notifies
 * observers when something changes in the list disposition. It also implements
 * {@link Drawable} (since it represents a drawable item) and observer, in order
 * to be able to change when the list to draw does change. Warning: since List
 * does not extend Observable the method 'addObserver(this)' is not called.
 * 
 * @author simone
 *
 * @param <T>: the param of the list to draw. To run properly method toString
 *        shoud be override in type T
 */
public class DrawableList<T> extends Observable implements Observer, Drawable {

	private List<T> list;
	private Placer placer;
	private int position;

	/**
	 * Creates a new istance of this class
	 * 
	 * @param list
	 *            : the list whose items's string representation will be drawed
	 * @param placer
	 *            : the placement rule
	 */
	public DrawableList(List<T> list, Placer placer) {
		super();
		this.list = list;
		this.placer = placer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ui.Drawable#draw(java.awt.Graphics)
	 */
	@Override
	public void draw(Graphics g) {
		for (int i = 0; i < list.size(); i++) {
			int index = i - position;
			int x = placer.getX(index);
			int y = placer.getY(index);

			g.drawString(list.get(i).toString(), x, y);

		}
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		setChanged();
		notifyObservers();
	}

	/**
	 * Moves the focus up
	 */
	public void up() {
		if (position > 0)
			position--;
		updateFocus();
	}

	/**
	 * Moves the focus down
	 */
	public void down() {
		if (position < list.size() - 1)
			position++;
		updateFocus();
	}

	private void updateFocus() {
		setChanged();
		notifyObservers();
	}

	public int getPosition() {
		return position;
	}

	public Placer getPlacementRule() {
		return placer;
	}
}
