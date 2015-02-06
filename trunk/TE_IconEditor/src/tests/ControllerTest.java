package tests;

import java.awt.Color;

import javax.swing.JFrame;

import control.IconController;
import view.IconPanel;
import model.Editor;
import model.tools.Pencil;

public class ControllerTest {
	
	public static void main(String[] args) {
		
		Editor editor = new Editor();
		Pencil pencil = new Pencil(editor);
		editor.setCurrentTool(pencil);
		editor.setIconDimension(64);
		
		IconPanel panel = new IconPanel(editor, 500);
		IconController controller = new IconController(editor, panel);
		panel.addMouseListener(controller);
		panel.addMouseMotionListener(controller);
		
		JFrame frame = new JFrame();
		frame.getContentPane().add(panel);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		editor.setCurrentColor(Color.BLUE);
		
	}

}
