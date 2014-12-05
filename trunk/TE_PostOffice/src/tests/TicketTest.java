package tests;

import ui.ClientButtonFrame;
import ui.TicketPrinter;
import centalSystem.CentralSystemMediator;
import centalSystem.ICentralSystem;
import centalSystem.ITicketPrinter;

public class TicketTest {

	public static void main(String[] args) {
		
		ITicketPrinter printer = new TicketPrinter();

		ICentralSystem mediator = new CentralSystemMediator(printer);

		ClientButtonFrame frame = new ClientButtonFrame(mediator);

	}

}
