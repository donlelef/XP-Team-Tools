package model;

import model.exceptions.InvalidCodeException;
import model.exceptions.InvalidYearException;

public class Relic {
	
	private String code;
	private int year;
	private String description;
	private String room;
	private static final String possibleCodeChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private static final int codeLength = 8;
	
	public Relic(String code, int year, String description, String room) throws InvalidCodeException, InvalidYearException {
		super();
		this.setCode(code);
		this.setYear(year);
		this.description = description;
		this.room = room;
	}
	
	public void setCode(String code) throws InvalidCodeException {
		if (this.verifyCode(code)) {
			this.code = code;
		} else {
			throw new InvalidCodeException();
		}
	}
	
	public void setYear(int year) throws InvalidYearException {
		if(verifyYear(year)){
			this.year = year;
		} else {
			throw new InvalidYearException(year);
		}
	}
	
	public String getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getRoom() {
		return room;
	}
	
	public int getYear() {
		return year;
	}
	
	@Override
	public String toString() {
		return "" + this.code+ " " + this.description + " " + this.year + " "+ this.room;
	}
	
	// To be extracted into a RelicVerifier ??
	private boolean verifyYear(int year) {
		return year >= 800 && year <= 1900;
	}

	private boolean verifyCode(String code) {
		if (code.length() != Relic.codeLength) {
			return false;
		}
		for (char character : code.toCharArray()) {
			if (Relic.possibleCodeChars.indexOf(character)==-1) {
				return false;
			}
		}
		return true;
	}
	
	

	

}
