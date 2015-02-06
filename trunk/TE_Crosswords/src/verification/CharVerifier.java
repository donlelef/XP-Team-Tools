package verification;

public class CharVerifier implements IVerifier {

	public static final String VERIFICATION_TYPE = "JKWXY";

	private String toBeVerified;

	private enum StrageChars {
		J('j'), K('k'), W('w'), X('x'), Y('y');

		private char strangeChar;

		private StrageChars(char strangeChar) {
			this.strangeChar = strangeChar;
		}

		public char getStrangeChar() {
			return this.strangeChar;
		}
	};

	public CharVerifier(String toBeVerified) {
		super();
		this.toBeVerified = toBeVerified;
	}

	@Override
	public String getToBeVerified() {
		return this.toBeVerified;

	}

	@Override
	public String toString() {
		return CharVerifier.VERIFICATION_TYPE;
	}

	@Override
	public void setString(String toBeSetted) {

		this.toBeVerified = toBeSetted;
	}

	@Override
	public String verify() throws InvalidFormatExeption {
		Integer occurrencies = 0;

		String toBeVerifiedCopy = toBeVerified.toLowerCase();
		char[] chars = toBeVerifiedCopy.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == ',' || chars[i] == ' ') {
				throw new InvalidFormatExeption(
						"Illigal string format: please correct what you typed.");
			}
		}

		for (StrageChars strangeChar : StrageChars.values()) {
			for (int i = 0; i < chars.length; i++) {
				if (chars[i] == strangeChar.getStrangeChar())
					occurrencies++;
			}
		}

		return occurrencies.toString();
	}
}
