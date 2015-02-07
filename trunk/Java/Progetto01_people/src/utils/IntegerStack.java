package utils;

public class IntegerStack
{
	private int counter;	// inizializzato a zero di default
	private int[] values;	// inizializzato a null di default
	
	public IntegerStack(int size)
	{
		this.values=new int[size];
	}
		
	public boolean push(int value)
	{
		if(counter < values.length)
		{
			values[counter]=value;
			counter++;
			return true;
		}
		return false;
	}
	
	public int pop()
	{
		if(counter>0)
		{
			counter--;
			return values[counter];
		}
		else
		{
			return 0;			// non posso restituire un valore booleano per controllare la riuscita dell'operazione.
		}
	}
}


// NB Incapsulamento. Non posso accedere dall'esterno agli attributi values e counter. Non è necessario al funzionamento dela classe.
// L'utente può attuare solo push e pop.
