package listPrinting;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

/**
 * This implementation of {@link MouseWheelListener} interface is built to
 * properly work with a ìn istance of {@link DrawableList} class. When a
 * {@link MouseWheelEvent} occurs in a certain component, this class move up and
 * down the focus of that list.
 * 
 * @author simone
 *
 * @param <T>: the param of the drawableList
 * @see DrawableList
 */
public class DrawableListMovementController<T> implements MouseWheelListener {

	private DrawableList<T> list;

	/**
	 * Creates a new istance of this class
	 * 
	 * @param drawableList: the list whose focus will be moved
	 */
	public DrawableListMovementController(DrawableList<T> drawableList) {
		this.list = drawableList;
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent event) {
		int rotation = (int) event.getPreciseWheelRotation();
		if (rotation > 0) {
			list.down();
		}
		if (rotation < 0) {
			list.up();
		}
	}

}
