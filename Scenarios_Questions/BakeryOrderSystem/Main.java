package Scenarios_Questions.BakeryOrderSystem;

public class Main {
	public static void main(String[] args) {
		OrderSystem<Items> system = new OrderSystem<>();
		
		system.addOrder(new Items("Choclate", 2, "Sweet"));
		system.displayAllOrder();
		
	}
}
		