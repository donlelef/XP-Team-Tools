package exeption;

public class Example02TryCatch {

	public static void main(String[] args) throws Exception {

		try {
			throw new Exception("Example01");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Hello World!");

	}

}
