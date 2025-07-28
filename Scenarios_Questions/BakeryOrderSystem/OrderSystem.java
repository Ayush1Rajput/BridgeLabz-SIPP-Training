package Scenarios_Questions.BakeryOrderSystem;

import java.util.*;

public class OrderSystem<T extends Items> {
	private Queue<T> orders;
	
	public OrderSystem() {
		orders = new LinkedList<>();
	}

	public void addOrder(T order) {
		orders.add(order);
	}
	
	public void displayAllOrder() {
		System.out.println("--- All Orders ---");
		for(T x: orders) {
			System.out.println("Item Name : "+ x.getItemName());
			System.out.println("Item Category : "+ x.getCategory());
			System.out.println("Item Quantity : "+ x.getQuantity());
			System.out.println();
		}
	}
	
	// Filter orders by category 
    public void filterOrdersByCategory(String category) {
        System.out.println(" Orders in category : " + category);
        boolean found = false;
        for (T order : orders) {
            if (order.getCategory().equalsIgnoreCase(category)) {
                System.out.println(order);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No orders found for this category.");
        }
    }
}
