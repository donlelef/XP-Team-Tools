package centralSystem.counters;

import java.util.Random;

import centalSystem.ICentralSystem;
import centalSystem.IPostCounter;

public class PriorityServiceCounter implements IPostCounter {

	private int priorityService;
	private int previousService;
	private ICentralSystem centralSystem;

	public PriorityServiceCounter(ICentralSystem centralSystemMediator,
			int priorityService) {
		super();
		this.priorityService = priorityService;
		this.previousService = priorityService;
		this.centralSystem = centralSystemMediator;
	}

	@Override
	public int nextTurn() {

		centralSystem.clientServedAtQueue(previousService);

		if (centralSystem.getTotalClientAtQueue(priorityService) != centralSystem
				.getNextClientAtQueue(priorityService) - 1) {

			this.previousService = priorityService;
			return priorityService;

		}

		Random randomizer = new Random(System.nanoTime());

		previousService = generateService(randomizer);
		return previousService;

	}

	private int generateService(Random randomizer) {

		int nextService = randomizer.nextInt(3);

		if (nextService == this.priorityService)
			nextService = generateService(randomizer);

		return nextService;

	}
	
	@Override
	public int getCurrentQueueHandled() {
		return this.previousService;
	}
	
}
