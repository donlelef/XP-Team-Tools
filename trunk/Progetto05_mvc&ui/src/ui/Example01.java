package ui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example01 {

	public static void main(String[] args) {

		JFrame frame = ExamplesUtils.createFrame();

		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		frame.getContentPane().add(panel);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.RED);
		frame.getContentPane().add(panel1,BorderLayout.SOUTH);
		
		JButton button01 = new JButton("Button01");  // borderLayout aggiusta la dimensione di un pannello in base ai componenti che vi sono compresi
		panel.add(button01);						// borderLayout è il layout manager di default di contentPane
		
		JButton button02 = new JButton("Button02");  
		panel.add(button02);
		
		JButton button03 = new JButton("Button02");  
		panel.add(button03);
		
		JButton button04 = new JButton("Button02");  // JPanel è il layout manager di default per JPanel. Come il responsive design di html5 va a capo quando la finestra si restringe
		panel.add(button04);



		frame.setVisible(true);
	}
}
