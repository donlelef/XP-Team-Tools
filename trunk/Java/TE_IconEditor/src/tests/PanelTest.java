package tests;

import javax.swing.JFrame;

import control.IconController;
import view.EditorMenu;
import view.IconPanel;
import model.Editor;

public class PanelTest {
	
	public static void main(String[] args) {
		
		Editor editor = new Editor();
		JFrame frame = new JFrame("Icon Editor");
		frame.setSize(550, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setJMenuBar(new EditorMenu(editor));
		
		IconPanel panel = new IconPanel(editor, 500);
		frame.getContentPane().add(panel);
		IconController controller = new IconController(editor, panel);
		panel.addMouseListener(controller);
		panel.addMouseMotionListener(controller);
		
		frame.setVisible(true);
	}

}
