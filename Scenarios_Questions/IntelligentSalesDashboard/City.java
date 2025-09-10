package Scenarios_Questions.IntelligentSalesDashboard;

import java.util.List;

public class City {
    private String name;
    private List<Store> stores;

    // Constructor, Getters
    public City(String name, List<Store> stores) {
        this.name = name;
        this.stores = stores;
    }

    public List<Store> getStores() {
        return stores;
    }
}