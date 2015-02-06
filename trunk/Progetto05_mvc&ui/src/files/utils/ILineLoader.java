package files.utils;

public interface ILineLoader {

	public abstract void loadLine(String line);

}

// E' molto importante mantenere nell'interfaccia solo metodi che possono essere utilizzati da TUTTI 
// i componenti che implementano quell'interfaccia.
// Qui NON si deve inserire un metodo del tipo SetPeopleList