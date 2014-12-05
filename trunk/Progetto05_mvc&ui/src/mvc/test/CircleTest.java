package mvc.test;

import javax.swing.JFrame;

import mvc.control.CircleController;
import mvc.model.Circle;
import mvc.view.CircleView;

public class CircleTest {
	
	public static void main(String[] args) {
		Circle circle = new Circle(300,300,100);
		CircleView view = new CircleView(circle);
		
		CircleController controller = new CircleController(circle);
		view.addMouseListener(controller);
		view.addMouseMotionListener(controller);
		
		JFrame frame = new JFrame();
		frame.setTitle("Circle");
		frame.setSize(800, 800);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);		// Dice a JVM di cessare l'esecuzione quando viene chiusa la finestra.
		frame.getContentPane().add(view);			// Permette di aggiungere elementi al frame
		frame.setVisible(true);		
	}

}
