package model;

import java.awt.Color;
import java.util.Observable;

/**
 * The model of the editor. It contains the icon, the selected color
 * and the selected tool. So the color is the same for all the tools
 * that are acting on the icon.
 * @author lele
 *
 */
public class Editor extends Observable{
	
	private Icon icon;
	private Color currentColor;
	private ITool currentTool;
	
	public Editor() {
		super();
		this.setIconDimension(16);
		this.currentColor = Color.BLACK;
	}
	
	public void edit(int xPixel, int yPixel){
		this.currentTool.operate(xPixel, yPixel);
		this.setChanged();
		this.notifyObservers();
	}

	public Color getCurrentColor() {
		return currentColor;
	}

	public void setCurrentColor(Color currentColor) {
		this.currentColor = currentColor;
	}

	public Icon getIcon() {
		return icon;
	}
	
	public void setIconDimension(int dimension) {
		this.icon = new Icon(dimension);
		this.setChanged();
		this.notifyObservers();
	}

	public void setCurrentTool(ITool currentTool) {
		this.currentTool = currentTool;
	}
	
}
