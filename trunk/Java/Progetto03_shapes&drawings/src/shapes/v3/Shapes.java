package shapes.v3;

public class Shapes {

	public float getSumAreas(Shape2D[] shapes){
		float sum=0;
		for (int i = 0; i < shapes.length; i++) {
			sum+=shapes[i].getArea();
		}
		return sum;
	}

}
