package Scenarios_Questions.BakeryOrderSystem;

public class Items {
	private String itemName;
	private int quantity;
	private String category;
	
	public Items(String itemName, int quantity, String category) {
		this.itemName = itemName;
		this.quantity = quantity;
		this.category = category;
	}
	
	public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }
    

}
