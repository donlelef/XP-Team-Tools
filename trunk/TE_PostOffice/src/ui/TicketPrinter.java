package ui;

import javax.swing.JFrame;
import javax.swing.JLabel;

import centalSystem.ITicketPrinter;

public class TicketPrinter extends JFrame implements ITicketPrinter{
	
	private static final long serialVersionUID = 1L;
	
	private JLabel printed = new JLabel("Yuo will see printed ticket...");

	public TicketPrinter() {
		super("Stampa Ticket");
		super.getContentPane().add(printed);
		super.setSize(300,100);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
	}
	
	@Override
	public void printTicket(int totalClient) {
		printed.setText("Your number is: "+totalClient);
	}

}
