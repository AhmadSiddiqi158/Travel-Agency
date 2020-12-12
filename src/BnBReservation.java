
public class BnBReservation extends HotelReservation {
	
	
	public BnBReservation(String bnbReservationName, Hotel hotelName, String roomType, int numNights) {
		super(bnbReservationName, hotelName, roomType, numNights);
		//HotelReservation bnbReservation= new HotelReservation(bnbReservationName, hotelName, roomType,numNights);
		
	}
	
	public int getCost(){
		return ((super.getCost()/this.getNumOfNights()) +1000)* this.getNumOfNights() ;
	}

}
