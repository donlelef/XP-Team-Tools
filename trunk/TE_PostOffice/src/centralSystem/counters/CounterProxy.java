package centralSystem.counters;

import centalSystem.IPostCounter;

public class CounterProxy implements IPostCounter{
	
	private IPostCounter postCounter;
	
	@Override
	public int nextTurn() {
		return postCounter.nextTurn();
	}
	
	@Override
	public int getCurrentQueueHandled() {
		return postCounter.getCurrentQueueHandled();
	}
	
	public void setCounterType(IPostCounter postCounter){
		this.postCounter = postCounter;
	}

}
