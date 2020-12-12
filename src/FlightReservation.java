
public class FlightReservation extends Reservation {
	
	private Airport departure;
	private Airport arrival;
	

	public FlightReservation(String reservationName,Airport departure, Airport arrival ) {
		super(reservationName);
		if (departure.equals(arrival)) {
	    	 throw new IllegalArgumentException ("Both Airports are same");
	    }
		else {
			this.departure=departure;
			this.arrival=arrival;
		}
	 	
	}
	
	public int getCost() {
		int BaseCost=5375;
		int Distance= Airport.getDistance(this.departure, this.arrival);
		double fuelCost= ((double)(Distance/167.52))*124;
		int totalCost=(int) (Math.ceil((fuelCost) + BaseCost+ departure.getFees()+ arrival.getFees()));
		return totalCost;
	}
	


	
	public boolean equals(Object O) {
		if(O instanceof FlightReservation) {
			FlightReservation FlightRes = (FlightReservation) O;
			if (this.reservationName().equals(FlightRes.reservationName())
					&&  (this.arrival.equals(FlightRes.arrival)) 
					&& (this.departure.equals(FlightRes.departure))) {
				return true;
			}	
		}
		return false;
			
	}
	

	

}
	
	
		
	
