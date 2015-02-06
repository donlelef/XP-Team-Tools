package drawings.tests;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import drawings.stringslist.DiagonalPlacer;
import drawings.stringslist.Placer;
import drawings.stringslist.StringsList;
import drawings.stringslist.VerticalPlacer;

public class StringsListController implements KeyListener{
	
	private StringsList list;
	private Placer placer;
	private JPanel panel;
	
	public StringsListController(StringsList list, Placer placer, JPanel panel) {
		super();
		this.list = list;
		this.placer = placer;
		this.panel = panel;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_UP){
			list.up();
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN){
			list.down();
		}
		if(e.getKeyCode()==KeyEvent.VK_A){
			placer.setPlacer(new VerticalPlacer());
		}
		if(e.getKeyCode()==KeyEvent.VK_B){
			placer.setPlacer(new DiagonalPlacer());
		}
		panel.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) { // Tasto tenuto premuto
		// TODO Auto-generated method stub
		
	}
	
	

}
