package shapes.v3;

public class Circle implements Shapes2D{

	private float ray;
	
	public Circle(float ray) {
		super();
		this.ray = ray;
	}

	public void setCircle(float ray) {
		this.ray = ray;
	}

	public float getArea() {
		return (float) (ray * ray * Math.PI);
	}
}
