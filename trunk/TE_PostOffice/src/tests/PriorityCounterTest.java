package tests;

import ui.ClientButtonFrame;
import ui.TicketPrinter;
import centalSystem.CentralSystemMediator;
import centalSystem.ICentralSystem;
import centalSystem.ITicketPrinter;
import centralSystem.counters.PriorityServiceCounter;

public class PriorityCounterTest {

	public static void main(String[] args) {
		
		ITicketPrinter printer = new TicketPrinter();

		ICentralSystem mediator = new CentralSystemMediator(printer);

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
