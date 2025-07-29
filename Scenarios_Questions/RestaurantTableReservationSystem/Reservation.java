package Scenarios_Questions.RestaurantTableReservationSystem;

public class Reservation implements Comparable<Reservation> {
	String customerName ;
	int tableNumber;
	String reservationTime;
	
	public Reservation(String customerName, int tableNumber, String reservationTime) {
		this.customerName = customerName;
		this.tableNumber = tableNumber;
		this.reservationTime = reservationTime;
	}

	@Override
	public int compareTo(Reservation o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
