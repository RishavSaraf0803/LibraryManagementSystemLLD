package ParkingLot.Data;

public class EntryPoint {

	private final String name;
	private final boolean isOpen;
	public EntryPoint(String name, boolean isOpen) {
		super();
		this.name = name;
		this.isOpen = isOpen;
	}
	public String getName() {
		return name;
	}
	public boolean isOpen() {
		return isOpen;
	}
	
	
}
