package ui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Example03 {

	public static void main(String[] args) {

		JFrame frame = ExamplesUtils.createFrame();
		
		JPanel panel=new JPanel();
		frame.getContentPane().add(panel);
		
		panel.setLayout(new GridLayout(3,1));
		
		JTextArea area=new JTextArea();
		panel.add(area);

		JTextArea area2=new JTextArea();
		//area2.setBackground(Color.CYAN);
		area2.setEditable(false);
		area2.setText("TODO TODO TODO TODO \n" +
				"TODO TODO TODO TODO ");
		panel.add(area2); 
		
		area2.setBorder(BorderFactory.createEtchedBorder());

		JTextArea area3=new JTextArea();
		area3.setBackground(Color.YELLOW);
		area3.setText("Scrivi qui...");
		JScrollPane scrollPane=new JScrollPane(area3);
		panel.add(scrollPane);
		
		frame.setVisible(true);
	}
}
