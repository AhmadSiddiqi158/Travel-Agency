
public class Hotel {
	
	private String HotelName;
	private Room [] HotelRooms;
	
	//hotel constructor
	public Hotel(String HotelName, Room[] rooms) {
		this.HotelName=HotelName;
		 HotelRooms = new Room[rooms.length];
		for (int i=0; i< rooms.length; i++) {
			 HotelRooms[i] = new Room(rooms[i]);
			
		}
	}
	
	public  int reserveRoom(String roomtype) {
		Room r;
		r=Room.findAvailableRoom(this.HotelRooms, roomtype);
		if (r!= null) {
			r.changeAvailability();
			return r.getPrice();
		}
		else {
			
			throw new IllegalArgumentException("No room found");
			
			
		}
			
	}
	
	public boolean cancelRoom (String roomtype) {
		boolean r=Room.makeRoomAvailable(this.HotelRooms, roomtype);
		return r ;
		
		
	}
}
	
	

	

