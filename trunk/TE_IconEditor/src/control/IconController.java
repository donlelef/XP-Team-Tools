package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import model.Editor;
import view.IconPanel;

public class IconController implements MouseListener, MouseMotionListener {

	private Editor editor;
	private IconPanel iconPanel;

	public IconController(Editor editor, IconPanel iconPanel) {
		this.editor = editor;
		this.iconPanel = iconPanel;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		try {
			editor.edit(mouse2PixelIndex(e.getX()), mouse2PixelIndex(e.getY()));
		} catch (Exception e1) {

		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		try {
			editor.edit(mouse2PixelIndex(e.getX()), mouse2PixelIndex(e.getY()));
		} catch (Exception e2) {
		}
	}

	private int mouse2PixelIndex(int mousePosition) {
		return mousePosition / this.iconPanel.getPixelDimension();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
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

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
