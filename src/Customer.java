
public class Customer {
	private String name;
	private int balance;
	private Basket customerReservations;
	
	public Customer(String customerName, int initialBalance) {
		Basket emptyBasket= new Basket();
		this.customerReservations=emptyBasket;
		this.name=customerName;
		this.balance=initialBalance;
		
	}

	public String getName() {
		return this.name;
	}

	public int getBalance() {
		return this.balance;
	}

	
	public Basket getBasket(){
		return this.customerReservations;
		
	}
	
	public int addFunds(int newBalance) {
		if (newBalance<0) {
			throw new IllegalArgumentException(" Can not add a negative amount");
		}
		else {
			this.balance+=newBalance;
		}
		return this.balance;
	}
	
	public int addToBasket(Reservation reservation) {
		if(this.name.equals(reservation.reservationName())) {
			this.customerReservations.add(reservation);
			return customerReservations.getNumOfReservations();
		}
		else
			throw new IllegalArgumentException("did not find a reservation of this type");
			
	}
	
	public int addToBasket(Hotel hName, String roomType, int numNights, boolean wantsBreakfast) {
		HotelReservation hr= new HotelReservation(this.name, hName, roomType, numNights);
		customerReservations.add(hr);
		return customerReservations.getNumOfReservations();
			
	}
	
	public int addToBasket(Airport a1, Airport a2) {
		FlightReservation fr= new FlightReservation(this.name, a1, a2);
		customerReservations.add(fr);
		return customerReservations.getNumOfReservations();
		
	}
	
	public boolean removeFromBasket(Reservation r) {
		 return customerReservations.remove(r);
		
	}
	
	public int checkOut() {
		if(this.balance<customerReservations.getTotalCost()) {
			throw new IllegalArgumentException("Not enough money to cover the total cost");
		}
		int balanceLeft= this.balance-customerReservations.getTotalCost();
		customerReservations.clear();
		return balanceLeft;
	
	}
}
