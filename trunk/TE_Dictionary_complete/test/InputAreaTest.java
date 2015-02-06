package test;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ui.InputArea;

public class InputAreaTest {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		InputArea area = new InputArea();
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		frame.getContentPane().add(panel);
		panel.add(area.getInputArea(), BorderLayout.CENTER);
		frame.setVisible(true);
		frame.setSize(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
