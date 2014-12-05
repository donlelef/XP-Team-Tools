package centalSystem;


public class CentralSystemMediator implements ICentralSystem {

	private Queue[] queues = {new Queue(), new Queue(), new Queue()};
	private ITicketPrinter ticketPrinter;
	
	public CentralSystemMediator(ITicketPrinter ticketPrinter) {
		super();
		this.ticketPrinter = ticketPrinter;
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

}
