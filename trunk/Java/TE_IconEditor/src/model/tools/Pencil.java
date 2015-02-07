package model.tools;

import model.Editor;
import model.ITool;

/**
 * This tool changes the color of a pixel of the icon.
 * The pixel is identified by its horizontal and vertical
 * index.
 * @author lele
 *
 */
public class Pencil implements ITool{
	
	private Editor editor;
	
	public Pencil(Editor editor) {
		super();
		this.editor = editor;
	}

	@Override
	public void operate(int xPixel, int yPixel) {
		this.editor.getIcon().setColor(xPixel, yPixel, this.editor.getCurrentColor());	
	}

}
