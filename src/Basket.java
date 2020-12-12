
public class Basket {
	private Reservation[] reservations;
	private int size=0;
	
	
	public Basket() {
		this.reservations = new Reservation [0];
	}
	
	public  Reservation[] getProducts() {
		Reservation[] copy= reservations;
		return copy;
	}
	
	public int add(Reservation resOne) {
		Reservation[] newRes= new Reservation[reservations.length+1]; //creating a new list with a bigger size
		size++;
		for(int i=0; i<newRes.length-1; i++) {						  //copying all the old elements from the previous list 
			newRes[i]=reservations[i];
		}
		newRes[newRes.length-1]= resOne; 								// adding the new element at the end
		reservations= new Reservation [newRes.length]; 					//creating the new reservations array with the size bigger than before because we added one element
		for (int i=0; i<newRes.length;i++) {							//adding all the elements back into the reservations
			reservations[i]=newRes[i];
		}
		return size;
	}
	
	
	  public boolean remove (Reservation resTwo) { 
		  Reservation Obj;
		  boolean found =false;
		  for(int j=0; j< this.reservations.length; j++) {
			  Obj= reservations[j];
			  if(Obj.equals(resTwo)) {
				  Reservation[] newReservation= new Reservation[this.reservations.length-1];
				  for(int i=0; i<j; i++) {
					  newReservation[i]= this.reservations[i];  
				  }
				  for (int k=j; k<newReservation.length; k++) {
					  newReservation[k]=this.reservations[k+1];  
				  }
				  this.reservations=newReservation;
				  found=true;
			  }
			  else {
				  found= false;
			  }
			  
		  }
		  return found;
	  } 
	 
	
	
	  public void clear() {
		  for(int i=0; i<reservations.length; i++) {
			  reservations[i]=null;
		  }
		  //this.reservations= new Reservation[0];
		 }
		  
	  
	  
	 
	
	public int getNumOfReservations() {
		return reservations.length;
	}
	
	public int getTotalCost() {
		int totalCost=0;
		Reservation Obj;
		for (int i=0; i< reservations.length; i++) {
			Obj=reservations[i];
			totalCost+=Obj.getCost();
		}
		return totalCost;
		
	}
}
