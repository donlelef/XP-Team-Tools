package centalSystem;

public interface ITicketPrinter {

	/**
	 * 
	 * This interface let an external component write on the ticket the number
	 * of clients waiting for service.
	 * 
	 * @author lele
	 * @param total
	 *            number of waiting client
	 */
	public void printTicket(int totalClient);

}
