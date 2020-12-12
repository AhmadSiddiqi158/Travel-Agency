
public class Airport {
	private int X; // x coordinate in km
	private int Y; // y coordinate in km
	private int AirportFees; // fees in cents
	
	// Airport Constructor
	public Airport(int X, int Y, int Fees) {
		this.X=X;
		this.Y=Y;
		this.AirportFees=Fees;
	}
	
	//getFees Method
	
	public int getFees() {
		return AirportFees;
	}
	
	public static int getDistance(Airport a, Airport b) {
		double Distance= Math.sqrt((Math.pow((a.X-b.X),2)+(Math.pow((a.Y-b.Y),2))));  
		int D= (int) Math.ceil(Distance);
		return D;
		
	}
/*	
	public static void main(String[] args ) {
		Airport a= new Airport(10,0,40);
		Airport b= new Airport (30,0,60);
		int c = getDistance(a,b);
		System.out.println(c);
		System.out.println(a.X);
		
	}
	*/
}
