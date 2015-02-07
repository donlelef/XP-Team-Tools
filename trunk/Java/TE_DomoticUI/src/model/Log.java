package model;

/**
 * 
 * @author simone
 *
 */
public class Log {

	private String theme;
	private Hour hour;
	private String message;

	public Log(String theme, Hour hour, String message) {
		super();
		this.theme = theme;
		this.hour = hour;
		this.message = message;
	}

	public String getTheme() {
		return theme;
	}

	public Hour getHour() {
		return hour;
	}

	public String getMessage() {
		return message;
	}
	
	@Override
	public String toString() {
		return ""+theme+" ("+hour.toString()+")\t"+message;
	}

}
