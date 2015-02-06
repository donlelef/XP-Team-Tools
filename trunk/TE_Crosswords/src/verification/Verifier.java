package verification;

public class Verifier implements IVerifier{
	
	private IVerifier verifier;

	public void setVerifier(IVerifier verifier){
		this.verifier = verifier;
	}
	
	@Override
	public String verify() throws InvalidFormatExeption{
		return verifier.verify();
	}
	
	@Override
	public String getToBeVerified() {
		return verifier.getToBeVerified();
	}
	
	@Override
	public String toString() {
		return verifier.toString();
	}
	
	@Override
	public void setString(String toBeSetted) {
		verifier.setString(toBeSetted);
	}

}
