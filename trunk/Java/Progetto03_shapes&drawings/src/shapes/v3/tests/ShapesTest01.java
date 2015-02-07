package shapes.v3.tests;

import shapes.v3.Circle;
import shapes.v3.Rectangle;
import shapes.v3.Shape2D;
import shapes.v3.Shapes;

public class ShapesTest01 {
	
	public static void main(String[] args) {
		
		Shape2D[] exampleShapes=new Shape2D[3];
		
		exampleShapes[0]=new Rectangle(1, 1);
		exampleShapes[1]=new Rectangle(2, 1);
		exampleShapes[2]=new Circle(1);
		
		Shapes shapes=new Shapes();
		System.out.println(shapes.getSumAreas(exampleShapes));
	}
}
