package model;

import java.awt.Color;

/**
 * The icon which the editor works on. It is assumed to be a 
 * square matrix of pixel; every pixel can be painted with 
 * a different color. When created, all the pixels are white.
 * Icon class extends Observable to notify every change in the color 
 * matrix.
 * @author lele
 *
 */
public class Icon{
	
	private Color[][] colors;
	private int dimension;
	
	public Icon(int dimension) {
		super();
		this.dimension=dimension;
		this.initializeIcon();
	}
	
	private void initializeIcon() {
		colors = new Color[dimension][dimension];
		for (int i = 0; i < this.dimension; i++) {
			for (int j = 0; j < this.dimension; j++) {
				colors[i][j] = Color.WHITE;
			}
		}		
	}
	
	public void setColor(int xPixel, int yPixel, Color color){
		try {
			this.colors[xPixel][yPixel] = color;
		} catch (Exception e) {
			// No operation required
		}
	}
	
	public Color[][] getColors() {
		return colors;
	}
	
	public int getDimension() {
		return dimension;
	}

}
