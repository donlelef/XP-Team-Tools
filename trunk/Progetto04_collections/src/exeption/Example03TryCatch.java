package exeption;

public class Example03TryCatch {
	
	public static void doSomething() throws Exception{
		throw new Exception("Example03");
	}

	public static void main(String[] args) {

		try {
			doSomething();
			System.out.println("Not written test");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Hello World!"); // Vengono evitate tutte le istruzioni interne a try e successive al lancio dell'eccezione

	}

}
