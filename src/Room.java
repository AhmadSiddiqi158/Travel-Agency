
public class Room {
	private String RoomType;
	private int RoomPrice; // in cents
	private boolean roomAvailable;
	
	
	
	public Room(String roomType) {
		roomAvailable=true;
		
		if (roomType.equalsIgnoreCase("double")) {
			this.RoomType=roomType;
			RoomPrice= (90*100);
		}
		else if (roomType.equalsIgnoreCase("queen")) {
			this.RoomType=roomType;
			RoomPrice=(110*100);
		}
		else if (roomType.equalsIgnoreCase("king")) {
			this.RoomType=roomType;
			RoomPrice=(150*100);
		}
		
		else {
			throw new IllegalArgumentException("no room of such type can be created");
		}
	}
	// not sure about this method
	public Room (Room room) {
		this.RoomType=room.getType();
		this.RoomPrice=room.getPrice();
		this.roomAvailable = room.roomAvailable;
		
		
		
	}
	
	public String getType() { 
		return this.RoomType;
	}
	
	
	public int getPrice() {
		return this.RoomPrice;
	}
	
	
	public void changeAvailability() {
		this.roomAvailable=!this.roomAvailable;
	}
	
	public static Room findAvailableRoom(Room[] rooms,String roomtype) {
		for (int i=0; i<rooms.length;i++) {
			if (rooms[i].getType().equalsIgnoreCase(roomtype)) {
				if(rooms[i].roomAvailable==true)
				return rooms[i];
			}
			
			}
		return null ;
		}
			
	public static boolean makeRoomAvailable(Room[] rooms,String roomtype) {
		for (int i=0; i<rooms.length; i++) {
			if((rooms[i].getType().equalsIgnoreCase(roomtype)) && (rooms[i].roomAvailable==false)) {
				rooms[i].changeAvailability();
				return true;
			}
		}
		return false;
	}
}
	
	


