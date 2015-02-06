package shapes.v1;

public class Shape2D {

	public static final int TYPE_CIRCLE = 0;
	public static final int TYPE_RECTANGLE = 1;
	private float ray;
	private float width,height;
	private int type;
	
	public void setRectangle(float width,float height){
		this.type=TYPE_RECTANGLE;
		this.width=width;
		this.height=height;
	}
	
	public void setCircle(float ray){
		this.type=TYPE_CIRCLE;
		this.ray=ray;
	}
	
	public int getType(){
		return type;
	}
	
	public float getCircleArea(){
		return (float)(ray*ray*Math.PI);
	}
	
	public float getRectangleArea(){
		return width*height;
	}
	
}
