package shapes.v3;

public class Rectangle implements Shapes2D{

	private float width, height;

	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}

	public void setRectangle(float width, float height) {
		this.width = width;
		this.height = height;
	}

	public float getArea() {
		return width * height;
	}

}
