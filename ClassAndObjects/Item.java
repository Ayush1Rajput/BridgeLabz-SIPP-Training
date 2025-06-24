public class Item {

    // Attributes 
    int itemCode;
    String itemName;
    double price;

    // Constructor to initialize item details
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: $" + price);
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Item item = new Item(101, "Wireless Mouse", 25.50);
        item.displayItemDetails();

        int quantity = 3;
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + totalCost);
    }
}
