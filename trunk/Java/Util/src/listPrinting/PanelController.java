package listPrinting;

import java.util.Observable;
import java.util.Observer;

/**
 * This class is able to control a {@link DrawablePanel} wich is meant to draw a
 * {@link DrawableList}: when the list changes its state the panel is forced to
 * repaint
 * 
 * @author simone
 *
 * @param <T>: the param of the list
 * @see DrawableList, {@link DrawablePanel}
 */
public class PanelController<T> implements Observer {

	private DrawablePanel panel;

	/**
	 * Creates a new istance of this class
	 * 
	 * @param panel
	 *            : the panel to control
	 * @param list
	 *            : the list to observe
	 */
	public PanelController(DrawablePanel panel, DrawableList<T> list) {
		super();
		this.panel = panel;
		list.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		panel.repaint();
	}

}
