package centalSystem;

import java.util.ArrayList;


public class CentralSystemMediator implements ICentralSystem {

	private Queue[] queues = {new Queue(), new Queue(), new Queue()};
	private ITicketPrinter ticketPrinter;
	private IVisualizer visualizer;
	private ArrayList<IPostCounter> counterList = new ArrayList<IPostCounter>();
	
	public CentralSystemMediator(ITicketPrinter ticketPrinter, IVisualizer visualizer) {
		super();
		this.ticketPrinter = ticketPrinter;
		this.visualizer = visualizer;
	}

	/* (non-Javadoc)
	 * @see centalSystem.ICentralSystem#addClientAtQueue(int)
	 */
	@Override
	public void addClientAtQueue(int index) {
		queues[index].addClient();
		ticketPrinter.printTicket(queues[index].getTotalClient());
		//System.out.println(queues[index].getTotalClient());
	}

	/* (non-Javadoc)
	 * @see centalSystem.ICentralSystem#clientServedAtQueue(int)
	 */
	@Override
	public void clientServedAtQueue(int index) {
		queues[index].clientServed();
	}
	
	/* (non-Javadoc)
	 * @see centalSystem.ICentralSystem#getNextClientAtQueue(int)
	 */
	@Override
	public int getNextClientAtQueue(int index){
		return queues[index].getNextClient();
	}
	
	/* (non-Javadoc)
	 * @see centalSystem.ICentralSystem#getTotalClientAtQueue(int)
	 */
	@Override
	public int getTotalClientAtQueue(int index){
		return queues[index].getTotalClient();
	}
	
	@Override
	public void addCounter(IPostCounter counter) {
		counterList.add(counter);
	}
	
	@Override
	public int nextTurnAtCounter(int index) {
		visualizer.insert(index, counterList.get(index).getCurrentQueueHandled(), this.getNextClientAtQueue(counterList.get(index).getCurrentQueueHandled()));
		return counterList.get(index).nextTurn();
	}
	
	@Override
	public int getCounterNumber() {
		return counterList.size();		
	}

}
