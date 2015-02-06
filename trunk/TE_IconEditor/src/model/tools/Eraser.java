package model.tools;

import java.awt.Color;

import model.Editor;
import model.ITool;

/**
 * This eraser changes the color of a pixel to white.
 * @author lele
 *
 */
public class Eraser implements ITool {
	
private Editor editor;
	
	public Eraser(Editor editor) {
		super();
		this.editor = editor;
	}

	@Override
	public void operate(int xPixel, int yPixel) {
		this.editor.getIcon().setColor(xPixel, yPixel, Color.WHITE);	
	}

}
