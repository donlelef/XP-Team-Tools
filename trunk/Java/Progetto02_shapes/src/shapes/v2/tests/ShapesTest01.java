package shapes.v2.tests;

import shapes.v2.Circle;
import shapes.v2.Rectangle;
import shapes.v2.Shape2D;
import shapes.v2.Shapes;

public class ShapesTest01 {
	
	public static void main(String[] args){
		
		Shape2D[] exampleShapes = new Shape2D[3];
		for (int i = 0; i < exampleShapes.length; i++) {
			exampleShapes[i] = new Shape2D();
		}
		exampleShapes[0].setRectangle(new Rectangle(1,1));
		exampleShapes[1].setRectangle(new Rectangle(2,1));
		exampleShapes[2].setCircle(new Circle(1));
		
		Shapes shapes=new Shapes();
		System.out.println(shapes.getSumAreas(exampleShapes));
		
	}

}
