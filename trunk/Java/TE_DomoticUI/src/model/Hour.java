package model;

public class Hour implements Comparable<Hour> {

	private int hour;
	private int min;
	private int sec;

	public Hour(int hour, int min, int sec) {
		super();
		this.setHour(hour);
		this.setMin(min);
		this.setSec(sec);
	}

	public void setHour(int hour) {
		if (hour>23)
			hour = 23;
		if (hour<0)
			hour = 0;
		this.hour = hour;
	}

	public void setMin(int min) {
		if (min>59)
			min = 59;
		if (min<0)
			min = 0;
		this.min = min;
	}

	public void setSec(int sec) {
		if (sec>59)
			sec = 59;
		if (sec<0)
			sec = 0;
		this.sec = sec;
	}

	public int getHour() {
		return hour;
	}

	public int getMin() {
		return min;
	}

	public int getSec() {
		return sec;
	}

	@Override
	public int compareTo(Hour other) {
		if (this.toSec() == other.toSec())
			return 0;
		else {
			if (this.toSec() < other.toSec()) {
				return -1;
			} else
				return 1;
		}
	}
	
	@Override
	public String toString() {
		return this.getHour() + ":" + this.getMin() + ":" + this.getSec();
	}

	private int toSec() {
		return 60 * 60 * this.getHour() + 60 * this.getMin() + this.getSec();
	}

}
