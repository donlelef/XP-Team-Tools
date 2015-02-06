package time;

public class Hour {
	
	private int h;
	private int m;
	
	//This constructor calls setters and getters to preserve Hour's behavior
	public Hour(int h, int m) { 
		this.setH(h);
		this.setM(m);
	}

	public int getH() {
		return h;
	}

	//Avoid invalid values to be inserted - TO BE DOCUMENTED
	public void setH(int h) { 
		if(h>=24)
			h=0;
		else if(h<0)
			h=0;
		this.h = h;
	}

	public int getM() {
		return m;
	}
	
	//Avoid invalid values to be inserted - TO BE DOCUMENTED
	public void setM(int m) { 
		if(m>=60)
			m=59;
		else if(m<0)
			m=0;
		this.m = m;
	}
	
	// This method implements the required functionality - it returns always a positive value 
	public int interval(Hour other){
		int mins=(this.h*60+this.m) - (other.h*60+other.m);
		if (mins>=0)
			return mins;
		else
			return -mins;
	}
}
