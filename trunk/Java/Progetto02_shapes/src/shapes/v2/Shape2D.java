package shapes.v2;

public class Shape2D {
	public static final int TYPE_CIRCLE = 0;
	public static final int TYPE_RECTANGLE = 1;
	private Circle circle;
	private Rectangle rectangle;
	private int type;

	public void setRectangle(Rectangle rectangle) {
		this.type = TYPE_RECTANGLE;
		this.rectangle = rectangle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public int getType() {
		return type;
	}

	public float getCircleArea() {
		return circle.getCircleArea();
	}

	public float getRectangleArea() {
		return rectangle.getRectangleArea();
	}
}