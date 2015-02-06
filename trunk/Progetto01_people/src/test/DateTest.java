
package test;

import utils.time.Date;

public class DateTest
{
	public static void main(String[] args)
	{
		System.out.println("Test di utils.Date");
		
		Date date = new Date(20,34,2014);				//Il costruttore di default è disponibile fintanto che non vengono dichiarati altri costruttori
		System.out.println("Month is "+date.getMonth());		//Concatenazione di stringhe effettuata tramite l'operatore +
		date.setMonth(-2);
		System.out.println("Month is "+date.getMonth());
		date.setDay(-4);
		System.out.println("Day is "+date.getDay());
		
		Date date2=new Date(31,2,2014);
		date2.setMonth(2);
		System.out.println("Day is "+date2.getDay());
	}
}
