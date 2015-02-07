package tests;

import java.awt.Color;

import javax.swing.JFrame;

import view.IconPanel;
import model.Editor;
import model.tools.Pencil;

public class IconPanelTest {
	
	public static void main(String[] args) {
		
		Editor editor = new Editor();
		Pencil pencil = new Pencil(editor);
		editor.setCurrentTool(pencil);
		
		JFrame frame = new JFrame();
		frame.getContentPane().add(new IconPanel(editor, 300));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		editor.setCurrentColor(Color.BLUE);
		
		editor.edit(3,3);
		editor.edit(0,0);
		editor.edit(1,1);
		editor.edit(15,15);
		
	}

}
