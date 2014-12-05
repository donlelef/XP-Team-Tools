package centralSystem.counters;

import centalSystem.ICentralSystem;
import centalSystem.IPostCounter;

public class LongestQueueCounter implements IPostCounter {

	private int previousService;
	private ICentralSystem centralSystem;

	public LongestQueueCounter(ICentralSystem centralSystem) {
		super();
		this.centralSystem = centralSystem;
		previousService = this.findLongestQueue();
	}

	@Override
	public int nextTurn() {
		centralSystem.clientServedAtQueue(previousService);
		previousService = findLongestQueue();
		return previousService;
	}

	private int findLongestQueue() {
		int[] awaitingClients = new int[3];
		for (int i = 0; i < 3; i++) {
			awaitingClients[i] = this.centralSystem.getTotalClientAtQueue(i)
					- this.centralSystem.getNextClientAtQueue(i) + 1;
		}
		int max = awaitingClients[0];
		int maxAt = 0;
		for (int i = 0; i < awaitingClients.length; i++) {
			if (awaitingClients[i] > max) {
				maxAt = i;
			}
		}
		return maxAt;
	}

}
