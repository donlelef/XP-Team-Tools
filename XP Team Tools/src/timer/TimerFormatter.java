package timer;

import java.util.StringTokenizer;

public class TimerFormatter {
	
	public static int[] getTimeStamp(long millis){
		Integer secondiTot = (int)millis / 1000;
		
		int[] vett = new int[2];
		vett[0] = secondiTot / 60;
		vett[1] = secondiTot % 60;
		
		return vett;
	}
	
	public static String getDisplay(int minute, int second) {
		String display = "";
		if (minute < 10 && second < 10)
			display = "0" + String.valueOf(minute) + ":0"
					+ String.valueOf(second);
		if (minute >= 10 && second < 10)
			display = String.valueOf(minute) + ":0" + String.valueOf(second);
		if (minute < 10 && second >= 10)
			display = "0" + String.valueOf(minute) + ":"
					+ String.valueOf(second);
		if (minute >= 10 && second >= 10)
			display = String.valueOf(minute) + ":" + String.valueOf(second);
		return display;
	}
	
	public static long getMillis(int minutes, int seconds) {
		return (minutes*60 + seconds)*1000;
	}
	/**
	 * Return int vett of dimension two. int[0] is the number of the minutes
	 * and int[1] is the number of seconds
	 * @param timeStamp
	 * @return
	 */
	
	public static int[] getMinSec(String timeStamp) {
		StringTokenizer strtok = new StringTokenizer(timeStamp);
		int[] time = new int[2];
		time[0] = Integer.parseInt(strtok.nextToken(":"));
		time[1] = Integer.parseInt(strtok.nextToken());
		return time; 
	}
	
	public static boolean isTimeStampValid(String timeStamp) {
		StringTokenizer strtok = new StringTokenizer(timeStamp, ":");
		boolean isValid = true;
		if(!strtok.hasMoreTokens()) {
			return false;
		}
		try {
			String min = strtok.nextToken();
			Integer.parseInt(min);
			String sec = strtok.nextToken();
			Integer.parseInt(sec);
			int a = Integer.parseInt(sec.substring(0, 1));
			if(a > 5) {
				isValid = false;
			}
		} catch (NumberFormatException e) {
			isValid = false;
		}
		
		return isValid;
	}

}
