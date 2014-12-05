package exeption;

public class Example05RunTime {
	
	public static void doSomethingBase() {
		throw new RuntimeException("Example03");
	}
	
	public static void doSomething() {
		doSomethingBase();
	}

	public static void main(String[] args) {

		doSomething();
		
		System.out.println("Hello World!"); // Vengono evitate tutte le istruzioni interne a try e successive al lancio dell'eccezione, non quelle all'esterno di try

	}

}
