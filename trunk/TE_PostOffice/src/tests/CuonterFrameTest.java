package tests;

import ui.ClientButtonFrame;
import ui.CounterFrame;
import ui.TicketPrinter;
import ui.VisualizerFrame;
import centalSystem.CentralSystemMediator;
import centalSystem.ICentralSystem;

public class CuonterFrameTest {

	public static void main(String[] args) {

		ICentralSystem mediator = new CentralSystemMediator(new TicketPrinter(), new VisualizerFrame());

		ClientButtonFrame frame = new ClientButtonFrame(mediator);
		
		CounterFrame counter1 = new CounterFrame(mediator);
		CounterFrame counter2 = new CounterFrame(mediator);
		CounterFrame counter3 = new CounterFrame(mediator);

	}

}
