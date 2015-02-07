package shapes.v2;

public class Circle {
	
	private float ray;

	public Circle(float ray) {
		super();
		this.ray = ray;
	}

	public void setCircle(float ray){
		this.ray=ray;
	}
	
	public float getCircleArea(){
		return (float)(ray*ray*Math.PI);
	}
}
