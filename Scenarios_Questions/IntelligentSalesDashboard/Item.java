package Scenarios_Questions.IntelligentSalesDashboard;

public class Item {
	private String name;
    private double price;
    private String category;
    
    public Item(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
    
    @Override
    public String toString() {
        return "Item{name='" + name + "', price=" + price + ", category='" + category + "'}";
    }
}
