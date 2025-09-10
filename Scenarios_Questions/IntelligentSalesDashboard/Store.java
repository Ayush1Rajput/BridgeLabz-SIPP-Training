package Scenarios_Questions.IntelligentSalesDashboard;

import java.util.Map;

public class Store {
    private String name;
    private Map<String, Customer> customers;

    // Constructor, Getters
    public Store(String name, Map<String, Customer> customers) {
        this.name = name;
        this.customers = customers;
    }

    public Map<String, Customer> getCustomers() {
        return customers;
    }
}