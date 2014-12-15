package tests;

import ui.ClientButtonFrame;
import ui.TicketPrinter;
import ui.VisualizerFrame;
import centalSystem.CentralSystemMediator;
import centalSystem.ICentralSystem;
import centralSystem.counters.PriorityServiceCounter;

public class PriorityCounterTest {

	public static void main(String[] args) {

		ICentralSystem mediator = new CentralSystemMediator(new TicketPrinter(), new VisualizerFrame());

		ClientButtonFrame frame = new ClientButtonFrame(mediator);
		
		PriorityServiceCounter counter = new PriorityServiceCounter(mediator, 0);
		
		mediator.addClientAtQueue(0);
		mediator.addClientAtQueue(0);
		mediator.addClientAtQueue(0);
		mediator.addClientAtQueue(0);
		System.out.println(counter.nextTurn());
		System.out.println(counter.nextTurn());
		System.out.println(counter.nextTurn());
		System.out.println(counter.nextTurn());
		System.out.println(counter.nextTurn());
		mediator.addClientAtQueue(0);
		System.out.println(counter.nextTurn());
		
		
	}

}
