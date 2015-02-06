package tests;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class TimerTest {
	
	public static void main(String[] args) {
		
		Timer timer = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Ciao");
				
			}
		});
		
		System.out.println(timer.isRunning());
		System.out.println(timer.isRepeats());
		System.out.println(timer.isCoalesce());
		timer.start();
		System.out.println(timer.isRunning());
		
		JFrame frame = new JFrame();
		frame.setSize(200,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
