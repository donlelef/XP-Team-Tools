package string;

public class StringStack {

	private int counter;
	private String[] strings;

	public StringStack(int maxLength) {
		this.strings = new String[maxLength];
	}

	public boolean push(String newString) {

		if (counter < strings.length) {
			strings[counter] = newString;
			counter++;
			return true;
		} else
			return false;
	}

	public String pop() {

		if (counter > 0) {
			counter--;
			return strings[counter];
		} else {
			return "ERRORE: hai già toccato il fondo.";
		}
		
	}
}