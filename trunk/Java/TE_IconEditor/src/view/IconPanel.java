package view;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import model.Editor;

public class IconPanel extends JPanel implements Observer {
	
	private static final long serialVersionUID = 1L;
	
	private Editor editor;

	public IconPanel(Editor editor, int dim) {
		super();
		this.editor = editor;
		this.setSize(dim, dim);
		editor.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		this.repaint();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int pixelDimension = getPixelDimension();
		for (int i = 0; i < this.editor.getIcon().getDimension(); i++) {
			for (int j = 0; j < this.editor.getIcon().getDimension(); j++) {
				g.setColor(this.editor.getIcon().getColors()[i][j]);
				g.fillRect(i*pixelDimension, j*pixelDimension, pixelDimension, pixelDimension);
			}
		}
	}

	public int getPixelDimension() {
		int pixelDimension = this.getHeight()/this.editor.getIcon().getDimension();
		return pixelDimension;
	}	
}
