// Abstract class FoodItem
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    // Parameterized Constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter and Setter methods (Encapsulation)
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Concrete method to get item details
    public void getItemDetails() {
        System.out.println("\n---- Food Item Details ----");
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    // Abstract method to calculate total price
    abstract double calculateTotalPrice();
}

// VegItem class extends FoodItem
class VegItem extends FoodItem {

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    double calculateTotalPrice() {
        return getPrice() * getQuantity();  // Veg items don't have extra charges
    }
}

// NonVegItem class extends FoodItem
class NonVegItem extends FoodItem {
    private static final double NON_VEG_CHARGE = 1.2;  // 20% extra for non-veg items

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    double calculateTotalPrice() {
        return getPrice() * getQuantity() * NON_VEG_CHARGE;  // Additional charges for non-veg items
    }
}

// Discountable interface
interface Discountable {
    void applyDiscount(double discountPercentage);
    String getDiscountDetails();
}

// VegItem and NonVegItem classes implement Discountable
class DiscountableVegItem extends VegItem implements Discountable {
    private double discount;

    public DiscountableVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        discount = getPrice() * discountPercentage / 100;
        setPrice(getPrice() - discount);  // Apply discount to price
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied: " + discount;
    }
}

class DiscountableNonVegItem extends NonVegItem implements Discountable {
    private double discount;

    public DiscountableNonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        discount = getPrice() * discountPercentage / 100;
        setPrice(getPrice() - discount);  // Apply discount to price
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied: " + discount;
    }
}

// Online Food Delivery System
public class OnlineFoodDelivery {

    public static void main(String[] args) {

        // Creating food items without using ArrayList
        VegItem vegItem = new VegItem("Veg Burger", 150, 2);
        NonVegItem nonVegItem = new NonVegItem("Chicken Burger", 200, 1);
        DiscountableVegItem discountableVegItem = new DiscountableVegItem("Paneer Tikka", 120, 3);
        DiscountableNonVegItem discountableNonVegItem = new DiscountableNonVegItem("Mutton Kebab", 250, 2);

        // Processing each food item
        processOrder(vegItem);
        processOrder(nonVegItem);
        processOrder(discountableVegItem);
        processOrder(discountableNonVegItem);
    }

    // Process each food item and calculate total price
    public static void processOrder(FoodItem foodItem) {
        foodItem.getItemDetails();
        double totalPrice = foodItem.calculateTotalPrice();
        System.out.println("Total Price (without discount): " + totalPrice);

        // If the item is Discountable, apply the discount
        if (foodItem instanceof Discountable) {
            Discountable discountableItem = (Discountable) foodItem;
            discountableItem.applyDiscount(10);  // Applying a 10% discount
            System.out.println(discountableItem.getDiscountDetails());
        }

        // Final price after possible discount
        totalPrice = foodItem.calculateTotalPrice();
        System.out.println("Final Price after discount: " + totalPrice);
        System.out.println();
    }
}
