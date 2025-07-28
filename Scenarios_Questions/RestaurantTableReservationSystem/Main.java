package Scenarios_Questions.RestaurantTableReservationSystem;

//import java.util.*;

public class Main {
	public static void main(String[] args) {
		Reservation rs = new Reservation("Ayush", 22,"28 july");
		Reservation rs1 = new Reservation("Karan", 20,"12 july");
		
		
		Operations op = new Operations();
		
		op.addReservation(rs.customerName, rs.tableNumber,rs.reservationTime);
		op.addReservation(rs1.customerName, rs1.tableNumber,rs1.reservationTime);
	
		
		op.display();
	}
	
	
}	
