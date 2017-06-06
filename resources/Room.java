package resources;

public class Room {
	
	//fields
	private Item[] roomInv;//items just lying around
	private String description;
	
	//constructor
	public Room(String description) {
		this.description = description;
		roomInv = new Item[0];
	}
	
	//getters
	public String describe() {
		return description;
	}
}