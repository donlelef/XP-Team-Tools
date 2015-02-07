package tests;

import ui.ClientButtonFrame;
import ui.TicketPrinter;
import ui.VisualizerFrame;
import centalSystem.CentralSystemMediator;
import centalSystem.ICentralSystem;

public class ClientButtonTest {

	public static void main(String[] args) {

		ICentralSystem mediator = new CentralSystemMediator(new TicketPrinter(), new VisualizerFrame());

		ClientButtonFrame frame = new ClientButtonFrame(mediator);

	}

}
