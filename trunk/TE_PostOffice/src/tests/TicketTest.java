package tests;

import ui.ClientButtonFrame;
import ui.TicketPrinter;
import ui.VisualizerFrame;
import centalSystem.CentralSystemMediator;
import centalSystem.ICentralSystem;
import centalSystem.ITicketPrinter;

public class TicketTest {

	public static void main(String[] args) {

		ICentralSystem mediator = new CentralSystemMediator(new TicketPrinter(), new VisualizerFrame());

		ClientButtonFrame frame = new ClientButtonFrame(mediator);

	}

}
