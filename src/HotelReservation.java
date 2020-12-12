
public class HotelReservation extends Reservation{
	
	private Hotel hotelName;
	private String roomType;
	private int numNights;
	private int price;
	
	public HotelReservation(String reservationName, Hotel hotelName, String roomType,int numNights) {
		super(reservationName);
		this.hotelName =hotelName;
		this.roomType= roomType;
		this.numNights= numNights;
		this.price= this.hotelName.reserveRoom(roomType);
		   
		
		
		
	}
	
	public int getNumOfNights () {
		return numNights;
	}
	
	public int getCost() {
		return (this.numNights*this.price);
	
	}
	
	public boolean equals(Object O) {
		if(O instanceof HotelReservation) {
			HotelReservation HotelRes = (HotelReservation) O;
			if (this.reservationName().equals(HotelRes.reservationName())
					&&  (this.hotelName.equals(HotelRes.hotelName)) 
					&& (this.roomType.equals(HotelRes.roomType))
					&&(this.numNights==(HotelRes.numNights))
					&& (this.price==(HotelRes.price))) {
				return true;
			}	
		}
		return false;
			
	}
	
	

	


}
