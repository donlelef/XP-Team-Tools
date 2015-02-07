package verification;

public class PalindromeVerifier implements IVerifier {
	
	public static final String VERIFICATION_TYPE = "PALINDROME";
	
	private String toBeVerified;

	public PalindromeVerifier(String toBeVerified) {
		super();
		this.toBeVerified=toBeVerified;  //TODO use set methods!!
	}
	
	@Override
	public String getToBeVerified() {
		return this.toBeVerified;
	}
	
	@Override
	public String toString() {
		return PalindromeVerifier.VERIFICATION_TYPE;
	}
	
	@Override
	public void setString(String toBeSetted) {
		this.toBeVerified = toBeSetted;		
	}

	@Override
	public String verify() throws InvalidFormatExeption {
				
		StringBuilder inverter = new StringBuilder(this.toBeVerified);
		
		char[] chars = toBeVerified.toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			if(chars[i]==','||chars[i]==' '){
				throw new InvalidFormatExeption("Illigal string format: please correct what you typed.");
			}
		}

		if (inverter.reverse().toString().compareToIgnoreCase(toBeVerified) == 0)
			return "sì";
		else
			return "no";
	}
	
}
