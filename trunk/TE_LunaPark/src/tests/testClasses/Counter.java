package tests.testClasses;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import model.CentralSystem;
import model.IPass;
import model.passes.APass;

/**
 * @author lele
 *
 */
public class Counter extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private CentralSystem sys;

	public Counter(CentralSystem sys) {
		super();
		this.sys = sys;
		this.buildFrame();
	}
	
	private void buildFrame() {
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel(new GridLayout(3,1));
		this.getContentPane().add(panel);
		
		JButton a = new JButton("Pass A");
		a.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				passSold(new APass());				
			}
		});
		panel.add(a);
		
		JButton b = new JButton("Pass B");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				passSold(new APass());				
			}
		});
		panel.add(b);
		
		JButton c = new JButton("Pass C");
		c.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				passSold(new APass());
				//sys.printPasses();
			}
		});
		panel.add(c);
		
		this.setVisible(true);		
	}

	private void passSold(IPass pass){
		sys.addPass(pass);
	}

}
