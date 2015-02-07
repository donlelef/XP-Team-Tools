package mvc.model;

import java.util.Observable;

public class Circle extends Observable{
	
	private int x,y,ray;

	public Circle(int x, int y, int ray) {
		super();
		this.x = x;
		this.y = y;
		this.ray = ray;
	}
	
	public void setX(int x) {
		this.x = x;
		setChanged();
		notifyObservers();
	}
	
	public void setY(int y) {
		this.y = y;
		setChanged();
		notifyObservers();
	}
	
	
	public int getRay() {
		return ray;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	

}
