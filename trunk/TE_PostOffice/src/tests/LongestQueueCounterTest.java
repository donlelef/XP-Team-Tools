package tests;

import ui.ClientButtonFrame;
import ui.TicketPrinter;
import ui.VisualizerFrame;
import centalSystem.CentralSystemMediator;
import centalSystem.ICentralSystem;
import centalSystem.ITicketPrinter;
import centralSystem.counters.LongestQueueCounter;
import centralSystem.counters.PriorityServiceCounter;

public class LongestQueueCounterTest {

	public static void main(String[] args) {
		
		ITicketPrinter printer = new TicketPrinter();

		ICentralSystem mediator = new CentralSystemMediator(printer, new VisualizerFrame());

		ClientButtonFrame frame = new ClientButtonFrame(mediator);
		
		LongestQueueCounter counter = new LongestQueueCounter(mediator);
		
		mediator.addClientAtQueue(0);
		mediator.addClientAtQueue(0);
		mediator.addClientAtQueue(0);
		mediator.addClientAtQueue(0);
		mediator.addClientAtQueue(0);
		System.out.println(counter.nextTurn());
		System.out.println("Prossimo cliente nella coda precedente: "+mediator.getNextClientAtQueue(0));
		System.out.println(counter.nextTurn());
		System.out.println("Prossimo cliente nella coda precedente: "+mediator.getNextClientAtQueue(0));
		System.out.println(counter.nextTurn());
		System.out.println("Prossimo cliente nella coda precedente: "+mediator.getNextClientAtQueue(0));
		mediator.addClientAtQueue(1);
		mediator.addClientAtQueue(1);
		mediator.addClientAtQueue(1);
		mediator.addClientAtQueue(1);
		System.out.println(counter.nextTurn());
		System.out.println("Prossimo cliente nella coda precedente: "+mediator.getNextClientAtQueue(1));
		System.out.println(counter.nextTurn());
		System.out.println("Prossimo cliente nella coda precedente: "+mediator.getNextClientAtQueue(1));
		System.out.println(counter.nextTurn());
		System.out.println("Prossimo cliente nella coda precedente: "+mediator.getNextClientAtQueue(1));
		System.out.println(counter.nextTurn());
		System.out.println("Prossimo cliente nella coda precedente: "+mediator.getNextClientAtQueue(0));
		System.out.println(counter.nextTurn());
		System.out.println("Prossimo cliente nella coda precedente: "+mediator.getNextClientAtQueue(1));
		System.out.println(counter.nextTurn());
		System.out.println("Prossimo cliente nella coda precedente: "+mediator.getNextClientAtQueue(0));
		
	}

}
