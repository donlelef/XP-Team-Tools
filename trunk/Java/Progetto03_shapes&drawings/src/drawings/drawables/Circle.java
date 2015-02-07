package drawings.drawables;

import java.awt.Graphics;

import drawings.Drawable;

public class Circle implements Drawable {

	private int x, y, ray;

	public Circle(int x, int y, int ray) {
		super();
		this.x = x;
		this.y = y;
		this.ray = ray;
	}

	@Override
	public void draw(Graphics g) {
		g.drawOval(x-ray, y-ray, ray<<1, ray<<1); // <<1 is a one-bit shift. It's much faster than multilplying

	}

}

//Le coordinate sono calcolate a partire dal vertice in alto a sinistra del pannello.
//Drawoval accetta come primi due parametri il vertice in alto a sinistra del rettangolo 
//circoscritto all'ovale.