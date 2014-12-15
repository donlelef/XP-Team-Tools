package tests;

import ui.ClientButtonFrame;
import ui.TicketPrinter;
import ui.VisualizerFrame;
import centalSystem.CentralSystemMediator;
import centalSystem.ICentralSystem;
import centralSystem.counters.OneServiceCounter;

public class OneServiceCounterTest {

	public static void main(String[] args) {

		ICentralSystem mediator = new CentralSystemMediator(new TicketPrinter(), new VisualizerFrame());

		ClientButtonFrame frame = new ClientButtonFrame(mediator);
		
		OneServiceCounter counter = new OneServiceCounter(mediator, 0);
		
		System.out.println(counter.nextTurn());
		
		mediator.addClientAtQueue(0);
		
		System.out.println(counter.nextTurn());
		
		System.out.println(counter.nextTurn());

	}

}
