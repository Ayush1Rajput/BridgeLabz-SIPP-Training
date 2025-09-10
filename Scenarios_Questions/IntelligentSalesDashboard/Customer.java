package Scenarios_Questions.IntelligentSalesDashboard;

import java.util.List;

public class Customer {
    private String name;
    private List<Order> orders;
    
    // Constructor, Getters
    public Customer(String name, List<Order> orders) {
        this.setName(name);
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}