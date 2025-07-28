package Scenarios_Questions.RestaurantTableReservationSystem;

import java.util.*;

public class Operations {
	ArrayList<Reservation> list = new ArrayList<>();
	
	public  void addReservation(String customerName, int tableNumber, String reservationTime) {
		list.add(new Reservation(customerName, tableNumber, reservationTime));
	}
	
	public void display() {
		Collections.sort(list);
		for(int i=0;i<list.size();i++) {
			System.out.println("Name : "+list.get(i).customerName);
			System.out.println("Date : "+ list.get(i).reservationTime);
			System.out.println("Table No. : "+ list.get(i).tableNumber);
			System.out.println();
		}
	}
}
