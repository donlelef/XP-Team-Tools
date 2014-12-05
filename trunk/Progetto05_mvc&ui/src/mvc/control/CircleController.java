package mvc.control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import mvc.model.Circle;

public class CircleController implements MouseListener, MouseMotionListener {

	private Circle circle;
	private boolean dragging;			// Vale true solo se il click avviene all'interno del cerchio
	private int xDistance;
	private int yDistance;

	public CircleController(Circle circle) {
		super();
		this.circle = circle;
	}
	
	@Override
	public void mousePressed(MouseEvent event) {
		int xMouse = event.getX();
		int yMouse = event.getY(); 
		
		int x=circle.getX();
		int y=circle.getY();
		
		int ray=circle.getRay();
		this.xDistance = xMouse - x;
		this.yDistance = yMouse - y;
		
		if ((xMouse-x)*(xMouse-x)+(yMouse-y)*(yMouse-y)<=ray*ray) {
			dragging= true;
		}else{
			dragging=false;
		}

	}	

	@Override
	public void mouseDragged(MouseEvent event) {
		int xMouse = event.getX();
		int yMouse = event.getY();
		
		if(dragging){
			circle.setX(xMouse - xDistance);
			circle.setY(yMouse - yDistance);
		}

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
