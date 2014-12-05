package centalSystem;

public class Queue {

	private int totalClient;
	private int nextClient = 1;

	public void addClient() {
		this.totalClient++;
	}

	public void clientServed() {
		if (nextClient <= totalClient) {
			this.nextClient++;
		}
	}

	public int getNextClient() {
		return nextClient;
	}
	
	public int getTotalClient() {
		return totalClient;
	}

}
