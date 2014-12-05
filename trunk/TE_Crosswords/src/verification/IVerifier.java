package verification;

public interface IVerifier {

	public String verify() throws InvalidFormatExeption;

	public String getToBeVerified();

	public String toString();
	
	public void setString(String toBeSetted);

}
