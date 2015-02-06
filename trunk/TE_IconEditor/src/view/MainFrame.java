package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import model.Editor;
import control.IconController;

public class MainFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private Editor editor = new Editor();
	private IconController controller;
	
	
	public MainFrame() {
		super("Icon Editor");
	}

	public void launch() {
		this.setSize(700, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setJMenuBar(new EditorMenu(editor));
		this.setResizable(false);
		IconPanel panel = new IconPanel(editor, 500);
		controller = new IconController(editor, panel);
		panel.addMouseListener(controller);
		panel.addMouseMotionListener(controller);
		this.getContentPane().add(panel);
		this.getContentPane().add(new GrayPanel(editor, 150, 500), BorderLayout.EAST);
		this.setVisible(true);
	}
}
