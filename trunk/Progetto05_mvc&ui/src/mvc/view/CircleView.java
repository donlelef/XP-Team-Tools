package mvc.view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import mvc.model.Circle;

public class CircleView extends JPanel implements Observer{
	
	private Circle circle;
	
	public CircleView(Circle circle) {
		super();
		this.circle = circle;
		circle.addObserver(this);   // This statement allows circleView to be notified if Circle changes ***DO NOT FORGET IT OR YOU'LL BE FIRED***
	}
	
	@Override
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		int ray = circle.getRay();
		graphics.setColor(Color.RED);
		graphics.fillOval(circle.getX()-ray, circle.getY()-ray, 2*ray, 2*ray);   // X, Y del rettangolo circoscritto; semiassi dell'ellisse 
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		repaint();
		
	}

}
