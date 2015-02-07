package timeRace;

/**
 * A decorator which adds to an operation the time it takes to be performed.
 * It implements Comparable interface, so that another component can order 
 * the operations form the fastest to the slowest or vice-versa
 * 
 * @author lele
 * @since 1.2
 * @version 1.2
 * @see Comparable, {@link IOperation}
 *
 */
public class OperationRanking implements Comparable<OperationRanking> {

	private IOperation operation;
	private long time;

	public OperationRanking(IOperation operation, long time) {
		super();
		this.operation = operation;
		this.time = time;
	}

	@Override
	public int compareTo(OperationRanking other) {
		if (this.time == other.time)
			return 0;
		else {
			if (this.time > other.time)
				return 1;
			else
				return -1;
		}
	}

	public IOperation getOperation() {
		return operation;
	}

	public long getTime() {
		return time;
	}

}
