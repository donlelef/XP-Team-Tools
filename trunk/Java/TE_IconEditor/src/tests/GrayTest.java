package tests;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import model.Editor;
import view.EditorMenu;
import view.GrayPanel;
import view.IconPanel;
import control.IconController;

public class GrayTest {
	
	public static void main(String[] args) {
		
		Editor editor = new Editor();
		JFrame frame = new JFrame("Icon Editor");
		frame.setSize(650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setJMenuBar(new EditorMenu(editor));
		
		IconPanel panel = new IconPanel(editor, 500);
		GrayPanel grayPanel = new GrayPanel(editor, 150, 500);
		frame.getContentPane().add(panel);
		frame.getContentPane().add(grayPanel, BorderLayout.EAST);
		IconController controller = new IconController(editor, panel);
		panel.addMouseListener(controller);
		panel.addMouseMotionListener(controller);
		
		frame.setVisible(true);
	}

}
