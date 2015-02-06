package verification;

import java.util.Observable;

public class Logger extends Observable{

	private IVerifier verifier;
	private String log;

	public Logger(IVerifier verifier) {
		super();
		this.verifier = verifier;
	}
	
	public String getLog(){
		return this.log;
	}
	
	public void setVerifier(IVerifier verifier) {
		this.verifier = verifier;
	}
	
	public IVerifier getVerifier() {
		return verifier;
	}

	public void generateLog() throws InvalidFormatExeption {
		this.log = "";
		log += verifier.toString()+ " ";
		log += verifier.getToBeVerified() + " ";
		log += verifier.verify();
		setChanged();
		notifyObservers();
	}

}
