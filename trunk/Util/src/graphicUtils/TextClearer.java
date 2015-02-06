package graphicUtils;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

/**
 * This implementation of {@link MouseListener} is able to clear the text in a
 * certain {@link JTextComponent}, given by constructor, any time the mouse
 * happens to click in the component's area. Any other mouse actions will be
 * completely resultless
 * 
 * @author simone
 *
 */
public class TextClearer implements MouseListener {

	private JTextComponent field;

	/**
	 * Creates a new istance of this class
	 * 
	 * @param field
	 *            : the component whose text will be cleared when a button
	 *            clicks on it
	 */
	public TextClearer(JTextComponent field) {
		super();
		this.field = field;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		field.setText("");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

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
