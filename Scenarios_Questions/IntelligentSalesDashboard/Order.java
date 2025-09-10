package Scenarios_Questions.IntelligentSalesDashboard;

import java.util.List;
import java.time.LocalDate;

public class Order {
	private List<Item> items;
    private LocalDate orderDate;

    
    public Order(List<Item> items, LocalDate orderDate) {
        this.items = items;
        this.orderDate = orderDate;
    }

    public List<Item> getItems() {
        return items;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}
