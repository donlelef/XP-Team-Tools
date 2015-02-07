package model;

/**
 * The list of the rooms of the museum
 * @author lele
 *
 */
public enum Rooms {
	
	SaloneMedioevale("Salone medioevale"),
	SaloneRinascimentale("Salone Rinascimentale"),
	SalaInquisizione("Sala dell'inquisizione"),
	SalaScienzeModerne("Sala delle scienze moderne"),
	SalaTecnologeModerne("Sala delle tecnologie moderne");
	
	private String name;
	
	private Rooms(String name){
		this.name = name;
	}
	
	/**
	 * Returns the name of the room
	 * @return the name of the room
	 */
	public String getName() {
		return name;
	}
}
