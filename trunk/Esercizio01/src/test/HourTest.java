package test;

import time.Hour;

public class HourTest {
	
	public static void main(String[] args){
		
		System.out.println("Test della classe Hour");
		
		Hour hour1 = new Hour(26,-10);
		Hour hour2 = new Hour(23,12);
		Hour hour3 = new Hour(12,32);
		
		System.out.println("Classe hour1: h="+hour1.getH()+" m="+hour1.getM());
		System.out.println("Classe hour1: h="+hour2.getH()+" m="+hour2.getM());
		System.out.println("Classe hour1: h="+hour3.getH()+" m="+hour3.getM());
		
		System.out.println("Intervallo 2-3:" +hour2.interval(hour3));
		System.out.println("Intervallo 3-2:" +hour3.interval(hour2));
		System.out.println("Intervallo 3-1:" +hour3.interval(hour1));
		System.out.println("Intervallo 1-3:" +hour1.interval(hour3));
	}
}
