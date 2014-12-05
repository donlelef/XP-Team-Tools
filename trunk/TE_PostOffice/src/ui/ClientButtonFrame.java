package ui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import centalSystem.ICentralSystem;

public class ClientButtonFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	private ICentralSystem centralSystem;

	public ClientButtonFrame(ICentralSystem centralSystem) {

		super("Prenotazione Servizio");
		this.centralSystem = centralSystem;
		buildFrame();
	}

	public void buildFrame() {
		this.setSize(600, 60);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel(new GridLayout(1,3));
		this.getContentPane().add(panel);
		JButton postButton = new JButton("Servizi Postali >>");
		JButton financialButton = new JButton("Servizi Finanziari >>");
		JButton otherButton = new JButton("Altri Servizi >>");

		postButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				centralSystem.addClientAtQueue(0);
			}
		});
		
		financialButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				centralSystem.addClientAtQueue(1);
				
			}
		});
		
		otherButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				centralSystem.addClientAtQueue(2);
				
			}
		});
		
		panel.add(postButton);
		panel.add(financialButton);
		panel.add(otherButton);
		
		this.setVisible(true);
	}

}
