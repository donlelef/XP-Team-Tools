package tests.testClasses;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.CentralSystem;

/**
 * A test model for any counter of an attraction.
 * @author lele
 *
 */
public class Attraction extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private String id;
	private CentralSystem sys;
	private JTextField field;
	private JPanel coloredPanel = new JPanel();
	
	public Attraction(String id, CentralSystem sys) {
		super();
		this.id = id;
		this.sys = sys;
		this.sys.addAttraction(this.id);
		this.buildFrame();
	}
	
	private void buildFrame() {
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(2, 1));
		
		JPanel panel = new JPanel(new GridLayout(3,1));
		JLabel label = new JLabel("Insert pass ID:");
		panel.add(label);
		this.field = new JTextField(50);
		panel.add(field);
		JButton button = new JButton("Validate Ticket");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				check(field.getText());				
			}
		});
		panel.add(button);
		
		this.getContentPane().add(panel);
		
		this.getContentPane().add(coloredPanel);
		
		this.setVisible(true);
	}

	/**
	 * It decides whether a customer can enter the attraction
	 * checking his pass, passing the id of the pass to the
	 * Central System.
	 * @param pass: the pass used
	 */
	public void check(String passId){
		if(sys.check(passId, this.id)){
			coloredPanel.setBackground(Color.GREEN);
		} else{
			coloredPanel.setBackground(Color.RED);
		}
	}
	
	/**
	 * DEBUG ONLY
	 * @return the id of this attraction
	 */
	public String getId() {
		return this.id;
	}

}
