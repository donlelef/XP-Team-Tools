package ui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example02 {

	public static void main(String[] args) {

		JFrame frame = ExamplesUtils.createFrame();
		
		//frame.getContentPane().setLayout(new BorderLayout());
		
		JPanel panel=new JPanel();
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel);
		
		panel.setLayout(new GridLayout(2,2));
		
		JButton button1=new JButton("Pulsante 1");
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("A");
			}
		});
		panel.add(button1);

		JButton button2=new JButton("Pulsante 2");
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("B");     // Nei progetti reali l'implementazione di questo metodo è contenuta nel modello
			}
		});
		panel.add(button2);

		JButton button3=new JButton("Pulsante 3");
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("C");
			}
		});
		panel.add(button3);
		
		frame.setVisible(true);
	}
}
