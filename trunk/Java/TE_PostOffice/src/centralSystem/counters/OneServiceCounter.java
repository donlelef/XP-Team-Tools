package centralSystem.counters;

import centalSystem.ICentralSystem;
import centalSystem.IPostCounter;

public class OneServiceCounter implements IPostCounter {

	private ICentralSystem centralSystem;
	private int serviceType;

	public OneServiceCounter(ICentralSystem centralSystem, int serviceType) {
		super();
		this.centralSystem = centralSystem;
		this.serviceType = serviceType;
	}

	@Override
	public int nextTurn() {
		this.centralSystem.clientServedAtQueue(serviceType);
		return serviceType;
	}
	
	@Override
	public int getCurrentQueueHandled() {
		return this.serviceType;
	}

}
