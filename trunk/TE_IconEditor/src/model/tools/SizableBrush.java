package model.tools;

import model.Editor;
import model.ITool;

/**
 * 
 * This implementation of {@link ITool} interface can represents a sizable
 * brush. It can change indeed the color of more than one pixel, i.e the one
 * currently selected plus the adjacents ones. The number of pixel around the
 * selected one to be colored can easily be set by changing the thickness of the
 * brush
 * 
 * @author simone
 * @version 1.2
 *
 */
public class SizableBrush implements ITool {

	private Editor editor;
	private int thickness;

	public SizableBrush(Editor editor, int thickness) {
		this.editor = editor;
		this.thickness = thickness;
	}

	@Override
	/*
	 * (non-Javadoc)
	 * @see model.ITool#operate(int, int)
	 */
	public void operate(int xPixel, int yPixel) {
		for (int i = xPixel - thickness; i <= xPixel + thickness; i++) {
			for (int j = yPixel - thickness; j <= yPixel + thickness; j++) {
				this.editor.getIcon().setColor(i, j,
						this.editor.getCurrentColor());
			}
		}
	}
}
