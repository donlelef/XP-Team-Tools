
package utils.time;				//Il package è il percorso della cartella in cui è contenuto il file con il punto al posto di slash

public class Date			// La classe con costruttori e metodi ma senza controlli è assolutamente inutile. Occorre scrivere in modo furbo set e get, in modo tale da avere sempre un valore accettabile negli attributi
{
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year)
	{
		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);
	}
	
	@Override
	public String toString() {
		return day+","+month+","+year;
	}
	
	public void setMonth(int month)			// I controlli sono indispensabili per definire il corretto comportamento della classe. 
	{						// Quello implementato è uno dei possibili comportamenti, si sarebbe potuto decidere di imporre sempre il valore massimo
		if(month<1)
			month = 1;
		else if(month>12)
			month = 12;
		this.month = month;
		this.setDay(this.day);
	}
	
	public int getMonth()
	{
		return this.month;
	}
	
	public static int getMaxDay(int month)
	{
		int maximumDay=31;
		switch(month)			// Solitamente non è conveniente usare il costrutto switch 
		{
			case 4: case 6: case 9: case 11:
				maximumDay=30;
				break;
			case 2:
				maximumDay=28;		// TODO: to be fixed. Manca gestione anni bisestili.
				break;
			default:
		}
		return maximumDay;	
	}
	
	public void setDay(int day)			// Questo metodo assolve 2 funzioni: calcolare il massimo giorno del mese e scrivere il giorno. Viene spezzato.
	{
		int maximumDay=getMaxDay(this.month);
		if(day<1)
			day = 1;
		else if(day>maximumDay)
			day = maximumDay;
		
		this.day = day;
	}
	
	public int getDay()
	{
		return this.day;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public int getYear()
	{
		return this.year;
	}
	
}
