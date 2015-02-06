package shapes.v1.tests;

import shapes.v1.Shape2D;
import shapes.v1.Shapes;

public class ShapesTest01 {
	
	public static void main(String[] args){
		
		Shape2D[] exampleShapes = new Shape2D[3];
		for (int i = 0; i < exampleShapes.length; i++) {
			exampleShapes[i] = new Shape2D();
		}
		exampleShapes[0].setRectangle(1,1);
		exampleShapes[1].setRectangle(2,1);
		exampleShapes[2].setCircle(1);
		
		Shapes shapes=new Shapes();
		System.out.println(shapes.getSumAreas(exampleShapes));
		
	}

}
