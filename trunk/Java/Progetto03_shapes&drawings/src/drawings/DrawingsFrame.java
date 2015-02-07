package drawings;

import java.awt.Graphics;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingsFrame {

	private Drawable drawable;
	private JPanel panel;
	private JFrame frame;

	public DrawingsFrame(Drawable drawable) {
		this.drawable = drawable;
	}

	public void draw(Graphics g) {
		drawable.draw(g);
	}
	
	public JPanel getPanel() {
		return panel;
	}
	
	public void addKeyListener(KeyListener keylistener){
		frame.addKeyListener(keylistener);
		panel.addKeyListener(keylistener);
	}

	public void launchFrame() {

		this.panel = new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				draw(g);
			}
		};
		
		this.frame = new JFrame();
		frame.setSize(300, 300);
		frame.setTitle("Drawings");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
	}
}
