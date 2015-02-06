package graphicUtils;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

/**
 * This implementation of {@link MouseListener} colors a {@link JComponent}'s foreground
 * any time a mouse enter the JComponent's area. When mouse exits the old color
 * is reset. Other mouse actions will be completely resultless
 * 
 * @author simone
 *
 */
public class ForeGroundPainter implements MouseListener {

	private JComponent component;
	private Color newColor;
	private Color oldColor;

	/**
	 * Creates a new istance of this class
	 * 
	 * @param component
	 *            : the component whose foreground will be painted
	 * @param newColor
	 *            : the color to set when mouse enter component's area
	 */
	public ForeGroundPainter(JComponent component, Color newColor) {
		super();
		this.component = component;
		this.newColor = newColor;
		oldColor = component.getForeground();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		component.setOpaque(true);
		component.setForeground(this.newColor);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		component.setForeground(this.oldColor);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
