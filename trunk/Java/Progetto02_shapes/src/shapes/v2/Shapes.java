package shapes.v2;

public class Shapes {
	
	public float getSumAreas(Shape2D[] shapes) {
		float sum = 0;
		for (int i = 0; i < shapes.length; i++) {
			switch (shapes[i].getType()) {
			case Shape2D.TYPE_RECTANGLE:
				sum += shapes[i].getRectangleArea();
				break;
			case Shape2D.TYPE_CIRCLE:
				sum += shapes[i].getCircleArea();
				break;
			}
		}

		return sum;
	}
}
