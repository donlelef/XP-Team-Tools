package tests;

import ui.ClientButtonFrame;
import ui.TicketPrinter;
import centalSystem.CentralSystemMediator;
import centalSystem.ICentralSystem;

public class ClientButtonTest {

	public static void main(String[] args) {

		ICentralSystem mediator = new CentralSystemMediator(new TicketPrinter());

		ClientButtonFrame frame = new ClientButtonFrame(mediator);

	}

}
