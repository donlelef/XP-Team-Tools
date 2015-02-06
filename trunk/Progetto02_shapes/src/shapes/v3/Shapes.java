package shapes.v3;

public class Shapes {
	
	public float getSumAreas(Shapes2D[] shapes) {			// I'm using the same function for every shape. I'll never change it!
		float sum = 0;
		for (int i = 0; i < shapes.length; i++) {
			sum+=shapes[i].getArea();
		}
		return sum;
	}
}
