package shapes.v2;

public class Rectangle {
	
	private float width,height;

	public Rectangle(float width, float height) {
		//super();
		this.width = width;
		this.height = height;
	}

	public void setRectangle(float width,float height){
		this.width=width;
		this.height=height;
	}

	public float getRectangleArea(){
		return width*height;
	}
}
