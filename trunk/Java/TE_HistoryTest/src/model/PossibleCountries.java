package model;


public enum PossibleCountries {
	Italia("Italia"),
	Francia("Francia"),
	Germania("Germania"),
	Prussia("Prussia"),
	Spagna("Spagna"),
	Austria("Austria"),
	Inghilterra("Inghilterra"),
	Russia("Russia"),
	Altro("Altro");
	
	private String name;
	
	private PossibleCountries(String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
}
